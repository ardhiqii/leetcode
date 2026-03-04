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
        StringBuilder val = new StringBuilder();
        String str = huh(n-1,hs);
        int i = 1;
        int cnt = 1;
        char curr = str.charAt(0);
        while(i < str.length()){
            char temp = str.charAt(i);
            if(curr == temp){
                cnt++;
            }else{
                val.append(Integer.toString(cnt));
                val.append(curr);
                curr = str.charAt(i);
                cnt = 1;
            }
            i++;
        }
        val.append(Integer.toString(cnt));
        val.append(curr);
        String r = val.toString();
        hs.put(n,r);

        return r;
    }
}