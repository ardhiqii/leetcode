class Solution {
    public int minOperations(String s) {
        int len = s.length();
        int i = 0;
        int zero = 0;
        int one = 0;
        int fz = '0';
        int fo = '1';
        while(i < len){
            char curr = s.charAt(i);
            if(curr != fz) zero++;
            if(curr != fo) one++;
            fz = (fz == '1') ? '0' : '1';
            fo = (fo == '1') ? '0' : '1';
            i++;
        }

        return Math.min(zero,one);
    }
}

