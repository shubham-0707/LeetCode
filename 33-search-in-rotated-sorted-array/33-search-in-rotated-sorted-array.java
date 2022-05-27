class Solution {
    
    public static int BinarySearch(int[] arr , int target , int start , int end){
        
        
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
    
    public static int findPivot(int[] arr){
    int start = 0;
    int end = arr.length-1;
    int mid = start + (end-start)/2;
    
    while(start<end){
        if(arr[mid]>=arr[0]){
            start = mid+1;
        }
        else{
            end = mid;
        }
        mid = start + (end-start)/2;
    }
    return mid;
}
    
    public int search(int[] nums, int target) {
        int idx = findPivot(nums);
        
        int ans = 0;
        if(target>=nums[idx] && target<=nums[nums.length-1]){
            ans = BinarySearch(nums , target , idx , nums.length-1);
        }
        else{
            ans = BinarySearch(nums , target , 0 , idx-1);
        }
        
        return ans;
    }
}