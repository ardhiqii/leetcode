class Solution {
    public int findFinalValue(int[] nums, int original) {
        int value = original;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length;i++){
            int curr = nums[i];
            if(value == curr) value*=2;
            if(curr > value) break;
        }
        return value;
    }
}