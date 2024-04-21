class Solution {
    public int[] singleNumber(int[] nums) {
        long xor  = 0;
        for(int i=0 ; i<nums.length ; i++) {
            xor = xor^nums[i];
        }

        long rightmost = (xor & (xor-1)) ^ xor;

        int xor1 = 0;
        int xor2 = 0;

        for(int i=0 ; i<nums.length ; i++) {
            if((rightmost & nums[i])>0) {
                xor1 = xor1 ^ nums[i];
            } else {
                xor2 = xor2 ^ nums[i];
            }
        }

        int[] ans = new int[2];
        ans[0] = xor1;
        ans[1] = xor2;

        return ans;
    }
}