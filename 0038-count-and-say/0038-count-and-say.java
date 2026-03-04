class Solution {
    public String countAndSay(int n) {
        HashMap<Integer,String> hs = new HashMap<>();
        return huh(n);
    }
    String huh(int n){
        if(n == 1) return "1";
        if(n == 2) return "11";
        String str = huh(n-1);
        String val = "";
        int i = 1;
        int cnt = 1;
        char curr = str.charAt(0);
        while(i < str.length()){
            char temp = str.charAt(i);
            if(curr == temp){
                cnt++;
            }else{
                val+=Integer.toString(cnt);
                val+=curr;
                curr = str.charAt(i);
                cnt = 1;
            }
            i++;
        }
        val+=Integer.toString(cnt);
        val+=curr;
        return val;
    }
}