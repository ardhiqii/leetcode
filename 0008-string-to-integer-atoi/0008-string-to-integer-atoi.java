class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        int i = 0;
        String res = "";
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
        boolean positive = true;
        if(s.charAt(i) == '-'){
            positive = false;
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
        for(i=i; i < s.length(); i++){
            char curr = s.charAt(i);
            if(!Character.isDigit(curr)){
                break;
            }else{
                res+=curr;
            }
        }
        if(res.length() == 0) return 0;
        int result = 0;
        
        try{
            result = Integer.parseInt(res);
        }catch(Exception  e){
            if(positive) return Integer.MAX_VALUE;
            if(!positive) return Integer.MIN_VALUE;
        }
        
        if(!positive){
            result = result * -1;
        }
        return result;
    }
}