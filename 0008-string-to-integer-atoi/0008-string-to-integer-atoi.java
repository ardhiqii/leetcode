class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        int i = 0;
        for(i = 0; i < s.length(); i++ ){
            char curr = s.charAt(i);
            if(curr == ' ')continue;
            if(curr == '-' || curr == '+') break;
            if(!Character.isDigit(curr)){
                return 0;
            }else{
                break;
            }
        }
        if(i >= s.length()) return 0;
        int sign = 1;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }

        for(i = i; i< s.length();i++){
            char curr = s.charAt(i);
            if(curr == '0')continue;
            if(!Character.isDigit(curr)){
                return 0;
            }
            if(Character.isDigit(curr)){
                break;
            }
        }
        long res = 0;
        for(i=i; i < s.length(); i++){
            char curr = s.charAt(i);
            if(!Character.isDigit(curr)){
                break;
            }else{
                int digit = curr - '0';
                res = res * 10 + digit;
            }

            if(sign * res <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign * res >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        return (int) (res * sign);
    }
}