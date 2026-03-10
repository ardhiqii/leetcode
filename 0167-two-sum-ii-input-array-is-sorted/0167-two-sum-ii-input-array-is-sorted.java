class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int l = 0;
        int r = numbers.length-1;
        while(l < r){
            int temp = numbers[l] + numbers[r];
            if(temp == target){
                res[0] = l+1;
                res[1] = r+1;
                break;
            }
            if(temp > target){
                r--;
            }
            if(temp < target){
                l++;
            }
        }
        return res;   
    }
}