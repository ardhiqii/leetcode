class Solution {
    public int numSteps(String s) {
        int res = 0;
        List<String> comp = new ArrayList<>(Arrays.asList(s.split("")));
        int len = comp.size();
        while(len > 1){
            char lsb = comp.get(len-1).charAt(0);
            if(lsb == '0'){
                comp.remove(len-1);
            }else{
                int carry = 1;
                for(int i = len -1 ; i >= 0 ;i--){
                    char curr = comp.get(i).charAt(0);
                    if(curr == '1'){
                        comp.set(i,"0");
                    }else{
                        comp.set(i,"1");
                        carry = 0;
                        break;
                    }
                }
                if(carry == 1){
                    comp.add(0,"1");
                }
            }
            res++;
            len = comp.size();
        }
        return res;
    }
}