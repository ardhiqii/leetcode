class Solution {
    public int searchInsert(int[] nums, int target) {
        return bs(nums,target);
    }
    private int bs(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        if(target > nums[r]){
            return r+1;
        }
        if(target < nums[l]){
            return 0;
        }
        while(l<=r){
            int m = l + (r-l)/2;
            int curr = nums[m];
            if(curr == target){
                return m;
            }
            if(curr > target){
                r = m -1;
            }
            if(curr < target){
                l = m+1;
            }
        }
        return l + (r-l)/2;
    }
}