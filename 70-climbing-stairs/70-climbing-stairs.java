class Solution {
    int[] nums = new int[] {1, 1};
    public int climbStairs(int n) {
        if (n == 1)
            return nums[1];
        int temp = nums[0] + nums[1];
        nums[0] = nums[1];
        nums[1] = temp;
        return climbStairs(n - 1);
    }
}