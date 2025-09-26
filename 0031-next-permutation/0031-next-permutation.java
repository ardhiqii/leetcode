class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 1)return;
        int idx = -1;
        int len = nums.length - 1;
        int[] temp = new int[len+1];
        Arrays.fill(temp,-1);
        for(int i = len; i >=0; i--){
            if(i==len){
                temp[len-i] = nums[i];
                continue;
            }
            int last = temp[len-i-1];
            int curr = nums[i];
            if(curr >= last){
                temp[len-i] = nums[i];
            }else{
                idx = i;
                break;
            }
        }
        if(idx == -1){
            for(int i = 0; i < len+1;i++){
                nums[i] = temp[i];
            }
            return;
        }
        // System.out.println(Arrays.toString(temp));
        // System.out.println(idx);
        int next = -1;
        for(int i = 0; i < len+1;i++){
            if(temp[i] > nums[idx]){
                next = temp[i];
                temp[i] = nums[idx];
                nums[idx] = next;
                break;
            }
        }
        int j = 0;
        for(int i = idx+1; i < len+1;i++){
            int curr = temp[j];
            if(curr == -1) break;
            nums[i] = temp[j];
            j++;
        }
    }
}