class Solution {
    
    public boolean binary_search(int[] arr , int key){
        int start=0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int n=nums.length;
        int ans=nums[0];
        for(int i=0 ; i<=n ; i++){
            if(binary_search(nums , i)==false){
                ans = i;
                break;
            }
        }
        return ans;
    }
}