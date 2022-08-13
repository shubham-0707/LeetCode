class Solution {
    public int singleNumber(int[] nums) {
        
        // Because of two same values gives us zero thats why only the element which occurs once is left at the last...
        
        int xor = 0;
        for(int i=0 ; i<nums.length ; i++){
            xor = xor^nums[i];
        }
        
        return xor;
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}