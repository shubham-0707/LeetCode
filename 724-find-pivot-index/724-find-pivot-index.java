class Solution {
    public int pivotIndex(int[] nums) {
        
        // initialising and calculating the sum
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
        }
        
        // initialising and calculating the prefix Sum...
        int prevSum = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(prevSum == (sum-prevSum-nums[i])){
                return i;
            }
            prevSum+=nums[i];
        }
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
        return -1;
    }
}