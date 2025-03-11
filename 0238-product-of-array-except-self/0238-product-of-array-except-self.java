class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int ridx = nums.length - 1 -i;
            if(i == 0){
                left[i] = nums[i];
                right[ridx] = nums[ridx];
                continue;
            }

            left[i] = left[i-1] * nums[i];
            right[ridx] = right[ridx+1] * nums[ridx];

        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                result[i] = right[i+1];
                continue;
            }
            if(i == nums.length - 1){
                result[i] = left[i-1];
                continue;
            }
            result[i] = left[i-1] * right[i+1];
        }
        return result;
    }
}