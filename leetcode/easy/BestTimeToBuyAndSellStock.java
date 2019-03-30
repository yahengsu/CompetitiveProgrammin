class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minP = Integer.MAX_VALUE;
        //minPrice
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < minP)
                minP = prices[i];
            else if(prices[i] - minP > maxP)
                maxP = prices[i] - minP;
        }
        return maxP;
    }
}   