class Solution {
    public int maxProfit(int[] prices) {
        
        
        int maxi = 0;
        
        int mini = Integer.MAX_VALUE;
        
        int profit = 0;
        
        for(int i=0 ; i<prices.length ; i++){
            profit = prices[i] - mini;
            maxi = Math.max(maxi , profit);
            
            mini = Math.min(mini , prices[i]);
        }
        return maxi;
    }
}