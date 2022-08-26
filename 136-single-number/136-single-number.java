class Solution {
    public int singleNumber(int[] nums) {
        
        // There can be many approaches to solve this question...
        // I am going to solve this using the XOR method...
        
        int xor = 0;
        for(int i=0 ; i<nums.length ; i++){
            xor = xor^nums[i];
        }
        return xor;
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}