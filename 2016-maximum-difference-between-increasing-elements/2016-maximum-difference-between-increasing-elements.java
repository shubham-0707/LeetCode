class Solution {
    public int maximumDifference(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = -1;
        for(int i=0 ; i<nums.length ; i++){
            mini = Math.min(mini , nums[i]);
            if(mini<nums[i]){
                int diff = nums[i]-mini;
                maxi = Math.max(maxi , diff);
            }
        }
        return maxi;
    }
}