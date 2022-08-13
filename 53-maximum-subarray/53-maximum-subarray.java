class Solution {
    public int maxSubArray(int[] nums) {
        
        
        // This is a very classical problem to use the very famous kadanes algorithm...
        
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            
            maxi = Math.max(maxi , sum);
            
            if(sum<0)
                sum=0;
        }
        return maxi;
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
        
    }
}