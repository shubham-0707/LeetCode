class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        //to find the pivot index...
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[end]){
                end = mid;
            }
            else start = mid+1;
        }
        int pivot = start;

        // to find the proper sub-array to apply binary search there...
        if(pivot == 0) return binarySearch(nums, 0, nums.length-1, target);
        else if(target>=nums[pivot] && target<=nums[nums.length-1]) return binarySearch(nums, pivot, nums.length-1, target);
        else return binarySearch(nums, 0, pivot-1, target);
    }

    private int binarySearch(int[] arr , int start , int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}