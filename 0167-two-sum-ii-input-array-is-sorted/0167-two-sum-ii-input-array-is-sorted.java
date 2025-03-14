class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length - 1;
        int[] result = new int[2];
        int left = 0;
        int right = len;
        while(left < right){
            int tempTotal = numbers[left] + numbers[right];
            if(tempTotal > target){
                right--;
                continue;
            }
            if(tempTotal < target){
                left++;
                continue;
            }
            if(tempTotal == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }
        }

        return result;
    }
}