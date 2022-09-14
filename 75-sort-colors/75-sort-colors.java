class Solution {
    
    public void swap(int[] nums , int left , int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
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
                swap(nums , i , right);
                right--;
            }
            else{
                i++;
            }
        }
        
    }
}