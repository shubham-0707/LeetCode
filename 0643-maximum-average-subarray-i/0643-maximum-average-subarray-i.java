class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxi = Integer.MIN_VALUE;
        double sum = 0;
        for(int i=0 ; i<k ; i++) {
            sum+=nums[i];
        }
        maxi = Math.max(sum, maxi);
        for(int i=k ; i<nums.length ; i++) {
            sum -= nums[i-k];
            sum+=nums[i];
            maxi = Math.max(sum, maxi);
        }
        double avg = maxi/(k*1.00000);
        return avg;
    }
}