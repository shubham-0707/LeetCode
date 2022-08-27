class Solution {
    public void sortColors(int[] nums) {
        
        int[] count = new int[3];
        for(int i=0 ; i<nums.length ; i++){
            count[nums[i]]++;
        }
        
        int k = 0;
        for(int i=0 ; i<count[0] ; i++){
            nums[k++] = 0;
        }
        for(int i=0 ; i<count[1] ; i++){
            nums[k++]=1;
        }
        for(int i=0 ; i<count[2] ; i++){
            nums[k++]=2;
        }
        
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
        
    }
}