class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        if(nums.length == 0) return result;
        if(nums.length == 1){
            int curr = nums[0];
            if(curr == target){
                return new int[] {0,0};
            }else{
                return result;
            }
        }
        int idx = bs(nums,target);
        if(idx == -1)return result;
        
        int start = idx;
        int last = idx;
        for(int i = idx; i >=0;i--){
            int curr = nums[i];
            if(curr == target){
                start = i;
                continue;
            }else{
                break;
            }
        }
        for(int i = idx;i < nums.length;i++){
            int curr = nums[i];
            if(curr == target){
                last = i;
                continue;
            }else{
                break;
            }
        }
        result[0] = start;
        result[1] = last;
        return result;
    }
    private int bs(int[] nums, int target){
        int l = 0;
        int h = nums.length - 1;
        while(l <= h){
            int m = l + (h - l) / 2;
            int curr = nums[m];

            if(curr == target){
                return m;
            }
            if( curr > target){
                h = m -1;
                continue; 
            }
            if(curr < target){
                l = m + 1;
                continue;
            }
        }
        
        return -1;
    }
}