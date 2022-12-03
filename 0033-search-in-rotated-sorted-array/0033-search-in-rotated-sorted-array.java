class Solution {
    
    public int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        
        int mid = start+(end-start)/2;
        while(start<end){
            if(nums[0]<=nums[mid]){
                start=mid+1;
            }
            else{
                end = mid;
            }
            mid=start + (end-start)/2;
        }
        
        return mid;
    }
    
    
    public int binarySearch(int[] arr , int start , int end , int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        
        int pivot = findPivot(nums);
        int ans = -1;
        if(target>=nums[pivot] && target<=nums[nums.length-1]){
            ans = binarySearch(nums , pivot  , nums.length-1 , target);
        }
        else{
            ans = binarySearch(nums , 0 , pivot-1 , target);
        }
        
        return ans;
    }
}