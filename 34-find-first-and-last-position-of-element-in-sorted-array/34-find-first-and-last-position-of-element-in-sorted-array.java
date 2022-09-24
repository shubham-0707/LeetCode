class Solution {
    
    public static int binarySearch2(int[] arr , int target){
        int ans = -1;
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target){
                ans=mid;
                start = mid+1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    
    public static int binarySearch1(int[] arr , int target){
        int ans = -1;
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]<target) start=mid+1;
            else end = mid-1;
        }
        
        return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int ans1 = binarySearch1(nums , target);
        int ans2 = binarySearch2(nums , target);
        
        return new int[]{ans1 , ans2};
    }
}