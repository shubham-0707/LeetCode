class Solution {
    public int maxProfit(int[] prices) {
        
        // to buy the stock at cheapest price..
        int mini = Integer.MAX_VALUE;
        
        // to sell the stock at the highest possible price..
        int maxi = Integer.MIN_VALUE;
        
        // to find the maximum profit ..
        
        for(int i=0 ; i<prices.length ; i++){
            mini = Math.min(mini , prices[i]);
            
            int profit = prices[i] - mini;
            
            maxi = Math.max(maxi , profit);
        }
        
        // return the maximum profit...
        return maxi;
    }
}