class Solution {
    
    public int binarySearch(int[] nums , int target , int start , int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    
    public int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end-start)/2;
        while(start<end){
            if(nums[0]<=nums[mid]){
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
        //System.out.println(idx+" ");
        int ans = 0;
        if(target>=nums[idx] && target<=nums[nums.length-1]){
            ans = binarySearch(nums , target , idx , nums.length-1);
        }
        else{
            ans = binarySearch(nums , target , 0 , idx-1);
        }
        return ans;
    }
}