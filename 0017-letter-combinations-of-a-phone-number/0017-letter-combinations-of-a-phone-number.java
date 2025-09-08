class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        if(digits.length() == 0) return res;
        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        bete(0,0,digits,hm,"",res);
        return res;
    }
    private void bete(int idx, int idx_let, String digits,HashMap<Character,String> hm,String curr,ArrayList<String> res){
        if(curr.length() == digits.length()){
            res.add(curr);
            return;
        }
        if(idx >= digits.length()){
            return;
        };
        String letter = hm.get(digits.charAt(idx)); 
        if(idx_let >= letter.length()){
            return;
        }
        String newCurr = curr + letter.charAt(idx_let);
        bete(idx+1,0,digits,hm,newCurr,res);
        bete(idx,idx_let+1,digits,hm,curr,res);
    }
}