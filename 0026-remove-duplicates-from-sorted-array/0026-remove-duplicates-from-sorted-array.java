class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[x]!=nums[i]){
                x++;
                nums[x] = nums[i];
            }
        }
        
        return x+1;
    }
}