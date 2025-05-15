class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<Integer> firstOn = new ArrayList<>();
        List<Integer> firstOff = new ArrayList<>();
        int on = 1;
        int off = 0;
        for(int i = 0; i < groups.length;i++){
            int curr = groups[i];
            if(curr == on){
                firstOn.add(i);
                on = on == 1 ? 0 : 1;
            }
            if(curr == off){
                firstOff.add(i);
                off = off == 0? 1 : 0;
            }
        }
        List<String> res = new ArrayList<>();
        if(firstOn.size() >= firstOff.size()){
            for(int i = 0; i < firstOn.size(); i++){
                res.add(words[firstOn.get(i)]);
            }
        }else{
            for(int i = 0; i < firstOff.size(); i++){
                res.add(words[firstOff.get(i)]);
            }
        }
        return res;
    }
}