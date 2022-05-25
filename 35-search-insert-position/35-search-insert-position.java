class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end-start)/2;
        
        if(Arrays.binarySearch(nums , target)>=0){
            return Arrays.binarySearch(nums , target);
        }

        else{
            while(start<=end){
                if(nums[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
                 mid = start + (end-start)/2;
            }
        }
        return mid;
    }
}