class Solution {
    public void moveZeroes(int[] nums) {
        
        /*
        Approach : In this approach we are swapping the starting element of the array with the non zero elements and incrementing the pointer...
        */
        
        int j=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for(;j<nums.length ; j++){
            nums[j]=0;
        }
        
        // Time Complexity : O(n)
        // Space Complexity : O(1) (in place)
    }
}