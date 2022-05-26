class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] arr = nums;
        int leftIndex = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target){
                leftIndex = mid;
                end = mid-1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        start = 0;
        end = nums.length-1;
        
        int rightIndex = -1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target){
                rightIndex = mid;
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        int[] ans = new int[2];
        ans[0] = leftIndex;
        ans[1] = rightIndex;
        
        return ans;
    }
}