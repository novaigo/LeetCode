class Solution {
    public int maxProfit(int[] prices) {
        //brute-force solution

        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            
            if (buy > prices[i]) {
                buy = prices[i];
                sell = Integer.MIN_VALUE;
            
             } else if (sell < prices[i]) {
                sell = prices[i];
                profit = Math.max(profit, sell - buy);
            }
        }
    
    return profit;
    }
}