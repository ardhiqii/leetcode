class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> hs = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < strs.length;i++){
            char[] carr = strs[i].toCharArray();
            Arrays.sort(carr);
            String curr = new String(carr);
            if(hs.containsKey(curr)){
                int idx = hs.get(curr);
                res.get(idx).add(strs[i]);
                continue;
            }else{
                hs.put(curr,res.size());
                res.add(new ArrayList<>(List.of(strs[i])));
            }           
        }
        return res;
    }
}