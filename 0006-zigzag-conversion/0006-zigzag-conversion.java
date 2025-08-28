class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        ArrayList<ArrayList<Character>> rows = new ArrayList<>();
        int row_index = 0;
        boolean last = false;
        String result = "";
        int i = 0;
        while(row_index < numRows && row_index >=0 && i < s.length()){
            if(i < numRows){
                rows.add(new ArrayList<Character>());
            }
            ArrayList curr = rows.get(row_index);
            curr.add(s.charAt(i));
            if(last){
                row_index--;
            }else{
                row_index++;
            }
            if(row_index == numRows){
                last = true;
                row_index = row_index-2;
            }
            if(row_index == 0){
                last = false;
            }
            i++;
        }
        
        for(i =0; i < rows.size();i++){
            ArrayList<Character> curr = rows.get(i);
            for(Character c : curr){
                result+=c;
            }
        }
        return result;
    }
}