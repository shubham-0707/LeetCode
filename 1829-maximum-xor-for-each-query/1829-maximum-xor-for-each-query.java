class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        
        // Since, the maximum number that can be formed using maximumBits is 2^maximumBit-1 
        
        int maxi = (int)Math.pow(2 , maximumBit)-1;
        int xor = 0;
        int[] ans = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            xor=xor^nums[i];
            ans[nums.length-i-1] = xor^maxi; // saving from backward in answer array...
        }
        return ans;
        
        // Time Complexity : O(N)
        // Space Complexity : O(1) if answer array is ignored...
    }
}