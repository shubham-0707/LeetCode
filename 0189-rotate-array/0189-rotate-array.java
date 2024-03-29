class Solution {
    
    
    public void reverse(int[] nums , int start , int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
            
        }
    }
    
    public void rotate(int[] nums, int k) {
        
        
        k = k%nums.length;
        
        if(k<nums.length){
            reverse(nums , 0 , nums.length-1);
            reverse(nums , 0 , k-1);
            reverse(nums , k , nums.length-1);
        }
        
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
        
    }
}