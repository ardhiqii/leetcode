class Solution {
    public String intToRoman(int num) {
        String str = String.valueOf(num);
        int divisor = 1;
        for(int i = 0; i<str.length()-1;i++){
            divisor *= 10;
        }
        int i = 0;
        HashMap<Integer,Character> hm = new HashMap<>();
        hm.put(1,'I');
        hm.put(5,'V');
        hm.put(10,'X');
        hm.put(50,'L');
        hm.put(100,'C');
        hm.put(500,'D');
        hm.put(1000,'M');
        String result = "";
        while(i < str.length()){
            int curr = (str.charAt(i) - '0');
            int total = curr * divisor;
            if(hm.containsKey(total)){
                result+= hm.get(total);
                divisor /= 10;
                i++;
                continue;
            }
            if(curr == 4){
                result+=hm.get(divisor);
                result+=hm.get(5*divisor);
                divisor /= 10;
                i++;
                continue;
            }
            if(curr == 9){
                result += hm.get(divisor);
                result += hm.get(divisor*10);
                divisor /= 10;
                i++;
                continue;
            }
            if(curr < 4){
                for(int j = 0; j < curr; j++){
                    result+= hm.get(divisor);
                }
                divisor /= 10;
                i++;
                continue;
            }
            if(curr < 9){
                int reminder = curr - 5;
                result+= hm.get(5*divisor);
                for(int j = 0; j < reminder; j++){
                    result+= hm.get(divisor);
                }
                divisor /= 10;
                i++;
                continue;
            }
        }
        return result;
    }
}