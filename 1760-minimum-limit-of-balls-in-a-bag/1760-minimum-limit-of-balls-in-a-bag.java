class Solution {
    
    public static boolean check(int[] arr , int mid , int opr){
        
        for(int i=0 ; i<arr.length ; i++){
            opr-=arr[i]/mid;
            
            if(arr[i]%mid==0){
                opr++;
            }
        }
        return opr>=0;
    }
    
    public int minimumSize(int[] nums, int opr) {
        int start = 1;
        int end = Integer.MAX_VALUE;
        int ans = 0;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(check(nums , mid , opr)){
                ans = mid;
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}