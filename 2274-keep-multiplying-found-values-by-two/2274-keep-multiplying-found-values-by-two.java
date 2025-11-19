class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> arr = new ArrayList<>();
        int value = original;
        for(int i = 0; i < nums.length; i++){
            arr.add(nums[i]);
            if(nums[i] == value)value*=2;
        }
        while(arr.contains(value)){
            value*=2;
        }
        return value;
    }
}