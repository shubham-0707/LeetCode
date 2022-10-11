class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        
        
        int[] prevSmallest = new int[nums.length];
        prevSmallest[0] = nums[0];
        
        int[] nextLargest = new int[nums.length];
        nextLargest[nums.length-1] = nums[nums.length-1];
        
        for(int i=1 ; i<nums.length ; i++){
            prevSmallest[i] = Math.min(prevSmallest[i-1] , nums[i]);
        }
        
        for(int i=nums.length-2 ; i>=0 ; i--){
            nextLargest[i] = Math.max(nextLargest[i+1] , nums[i]);
        }
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]>prevSmallest[i] && nums[i]<nextLargest[i])
                return true;
        }
        
        return false;
    }
}