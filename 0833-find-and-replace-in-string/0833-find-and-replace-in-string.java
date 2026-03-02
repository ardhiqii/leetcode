class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < indices.length; i++){
            if(s.startsWith(sources[i],indices[i])){
                hs.put(indices[i],i);
            }
        }
        String res = "";
        int i = 0;
        while(i < len){
            if(hs.containsKey(i)){
                res+=targets[hs.get(i)];
                i+=sources[hs.get(i)].length();
            }else{
                res+=s.charAt(i);
                i++;
            }
        }
        return res;   
    }
}