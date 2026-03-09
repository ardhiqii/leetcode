class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int b = prices[0];
        for(int i = 1; i < prices.length; i++){
            int c = prices[i];
            if(b > c){
                b = c;
            }
            profit = Math.max(profit,(c-b));
        }
        return profit;
    }
}