class Solution {
    public void swap(int[] nums , int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        for(int i=0 ; i<=end ; ){
            if(nums[i]==0){
                swap(nums , i , start);
                start++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums , i , end);
                end--;
            }
            else{
                i++;
            }
        }
    }
}