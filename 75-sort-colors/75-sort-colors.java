class Solution {
    
    public void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        
        
        int left = 0;
        int right = nums.length-1;
        
        for(int i=0 ; i<=right ; ){
            if(nums[i]==0){
                swap(nums , i , left);
                left++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums , i  , right);
                right--;
            }
            else{
                i++;
            }
        }
        
    }
}