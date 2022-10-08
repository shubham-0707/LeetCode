class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        
        int x = cost[cost.length-1];
        int y = cost[cost.length-2];
        
        for(int i=cost.length-3 ; i>=0 ; i--){
            int temp = y;
            y = cost[i] + Math.min(x , y);
            x = temp;
        }
        
        return Math.min(x , y);
        
        
    }
}