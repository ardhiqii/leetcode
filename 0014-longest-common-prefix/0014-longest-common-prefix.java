class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        boolean notFound = false;
        char c = 0;
        int i = 0;
        int j = 0;
        while(true){
            if(i == strs.length){
                i=0;
                result+=c;
                c=0;
                j++;
            }
            String str = strs[i];
            if(j >= str.length()){
                break;
            }
            char curr = str.charAt(j);
            if(c == 0){
                i++;
                c = curr;
                continue;
            }
            if(c == curr){
                i++;
                continue;
            }else{
                break;
            }

        }
        return result;
    }
}