class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int[] result = new int[2];
        int l = 0;
        int r = length - 1;
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum > target){
                r = r -1;
            }else if (sum < target){
                l = l + 1;
            }else if(sum == target){
                result[0] = l+1;
                result[1] = r+1;
                break;
            }
        }
        return result;
    }
}