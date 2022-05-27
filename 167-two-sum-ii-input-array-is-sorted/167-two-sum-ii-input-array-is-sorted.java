class Solution {
    
    public static int BinarySearch(int[] arr  , int start , int end , int key){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int i=0 ; i<numbers.length ; i++){
            int key = target - numbers[i];
            int idx = BinarySearch(numbers , i+1 , numbers.length-1 , key);
            if(idx>-1){
                ans[0] = i+1;
                ans[1] = idx+1;
                break;
            }
        }
        return ans;
    }
}