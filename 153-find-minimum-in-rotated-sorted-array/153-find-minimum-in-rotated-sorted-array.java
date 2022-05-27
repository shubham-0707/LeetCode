class Solution {
    public int findMin(int[] nums) {
        
        int mini = Integer.MAX_VALUE;
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]<mini){
                mini=nums[i];
            }
        }
        return mini;
    }
}