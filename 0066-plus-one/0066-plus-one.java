class Solution {
    public int[] plusOne(int[] digits) {
        int res = 1;
        int carry=0;
        for(int i =digits.length-1;i>=0;i--){
            int curr = digits[i] +res + carry;
            res = 0;
            if(curr <10){
                digits[i] = curr;
                carry = 0;
                return digits;
            }else{
                carry = 1;
                digits[i] = curr%10;
            }
        }
        if(digits[0] == 0){
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }
}