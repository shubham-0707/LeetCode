class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxi = 0;
        
        for(int i=0 ; i<prices.length ; i++){
            minSoFar = Math.min(prices[i] , minSoFar);
            int profit = prices[i]-minSoFar;
            maxi = Math.max(maxi , profit);
        }
        return maxi;
    }
}