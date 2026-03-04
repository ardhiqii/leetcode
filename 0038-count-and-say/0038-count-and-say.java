class Solution {
    public String countAndSay(int n) {
        HashMap<Integer,String> hs = new HashMap<>();
        hs.put(1,"1");
        hs.put(2,"11");
        return huh(n, hs);
    }
    String huh(int n,HashMap<Integer,String>hs){
        if(hs.containsKey(n)){
            return hs.get(n);
        }
        String str = huh(n-1,hs);
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
        hs.put(n,val);

        return val;
    }
}