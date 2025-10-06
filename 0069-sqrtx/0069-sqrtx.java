class Solution {
    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        int ans = -1;
        while(l<r){
            long m = l+ (r-l)/2;
            long temp = m*m;
            if(temp == x){
                ans = (int)m;
                return ans;
            }
            if(r-l == 1){
                break;
            }
       
            if(temp > x){
                r = m--;
                continue;
            }
            if(temp < x){
                l = m++;
                continue;
            }
            
        }
      
        for(long i = l; i <=r; i++){
            long temp = i*i;
            if(temp <= x){
                ans = (int)i;
            }
        }
        return ans;          
    }
}