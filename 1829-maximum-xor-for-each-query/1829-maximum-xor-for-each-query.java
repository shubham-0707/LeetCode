class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        
        // Using hints I have come to know to a solution...
        // ans[i] = xor[0-i]^(2^maximumBit-1)
        
        int maxi = (int)Math.pow(2 , maximumBit)-1;
        int[]  ans = new int[nums.length];
        
        int xor = 0;
        for(int i=0 ; i<nums.length ; i++){
            xor=xor^nums[i];
            ans[nums.length-i-1] = xor^maxi;
        }
        return ans;
    }
}