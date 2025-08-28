class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        ArrayList<ArrayList<String>> rows = new ArrayList<>();
        int row_index = 0;
        boolean last = false;
        String result = "";
        int i = 0;
        while(row_index < numRows && row_index >=0 && i < s.length()){
            if(i < numRows){
                ArrayList<String> newValue = new ArrayList<>();
                newValue.add(""); 
                rows.add(newValue);
            }
            ArrayList<String> curr = rows.get(row_index);
            String value = curr.get(0);
            value+= s.charAt(i);
            curr.set(0,value);
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
            ArrayList<String> curr = rows.get(i);
            result += curr.get(0);
        }
        return result;
    }
}