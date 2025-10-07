class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,3);
        int last = 3;
        int res = 0;
        if(last < n){
            for(int i = last+1; i <=n; i++){
                int sum = hm.get(i-1) + hm.get(i-2);
                hm.put(i,sum);
            }
        }
        return hm.get(n);
    }
}