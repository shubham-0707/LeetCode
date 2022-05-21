class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int lastEle = nums[nums.length-1];
        int secondEle = nums[nums.length-2];
        int thirdEle = nums[nums.length-3];
        
        return Math.max(nums[0]*nums[1]*lastEle , lastEle*secondEle*thirdEle);
    }
}