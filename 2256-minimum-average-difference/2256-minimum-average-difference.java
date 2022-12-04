class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        // just calculate the prefix sum at all the indexes and then use it to calculate what is required in the question..
        
        // using long is a must if you are coding in java...
        
        long sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
        }
        
        long mini = Long.MAX_VALUE;
        int minIdx = 0;
        long prevSum = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            long avg2=0;
            prevSum+=nums[i];
            long avg1 = prevSum/(i+1);
            if((nums.length-(i+1))>0){
                avg2 = (sum-prevSum)/(nums.length-(i+1));
            }
            long abD = Math.abs(avg1-avg2);
            if(abD<mini){
                mini=abD;
                minIdx=i;
            }
        }
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
        return minIdx;
    }
}