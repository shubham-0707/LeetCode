class Solution {
    
    public static int binarySearch1(int[] nums , int target){
        int ans = -1;
        
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    
    public static int binarySearch2(int[] nums , int target){
        int ans = -1 ;
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target){
                ans = mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        ans[0] = binarySearch1(nums , target);
        ans[1] = binarySearch2(nums , target);
        
        return ans;
    }
}