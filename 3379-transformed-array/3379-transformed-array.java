class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(curr == 0){
                res[i] = nums[i];
                continue;
            }
            int idx = find(curr,i,nums.length);
            res[i] = nums[idx]; 
        }
        return res;
    }

    int find(int num,int idx, int length){
        int shift = num%length;
        int res = shift + idx;
        if(res >=length || res < 0){
            if(res > 0){
                res -=length;
            }else if (res < 0){
                res +=length;
            }
          
        }
        return res;
    }
}