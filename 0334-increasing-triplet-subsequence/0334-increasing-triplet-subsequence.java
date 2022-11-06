class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        
        int[] prevSmaller = new int[nums.length];
        int[] nextGreater = new int[nums.length];
        
        prevSmaller[0] = nums[0];
        nextGreater[nums.length-1] = nums[nums.length-1];
        
        for(int i=1 ; i<nums.length ; i++){
            prevSmaller[i] = Math.min(prevSmaller[i-1] , nums[i]);
        }
        
        for(int i=nums.length-2 ; i>=0 ; i--){
            nextGreater[i] = Math.max(nextGreater[i+1] , nums[i]);
        }
        
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]>prevSmaller[i] && nums[i]<nextGreater[i]){
                return true;
            }
        }
        
        return false;
    }
}