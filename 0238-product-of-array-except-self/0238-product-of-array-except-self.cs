public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] result = new int[nums.Length];
        int[] left = new int[nums.Length];
        int[] right = new int[nums.Length];

        for(int i = 0; i < nums.Length; i++){
            int ridx = nums.Length - 1 -i;
            if(i == 0){
                left[i] = nums[i];
                right[ridx] = nums[ridx];
                continue;
            }
            left[i] = left[i-1] * nums[i];
            right[ridx] = right[ridx + 1] * nums[ridx]; 
        }

        for(int i = 0 ; i < nums.Length ; i++){
            if(i == 0){
                result[i] = right[i+1];
                continue;
            }
            if(i == nums.Length - 1){
                result[i] = left[i-1];
                continue;
            }
            result[i] = left[i-1] * right[i+1];
        }

        return result;
        
    }
}