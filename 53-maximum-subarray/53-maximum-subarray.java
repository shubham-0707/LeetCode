class Solution {
    public int maxSubArray(int[] nums) {
        
        //Approach is that we are going to use the Kadane's Algorithm...
        
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            maxi = Math.max(maxi , sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}