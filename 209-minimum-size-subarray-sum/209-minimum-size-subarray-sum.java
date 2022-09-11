class Solution {
    public static int binary_search(int[] prefix , int key , int high){
        int low = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(prefix[mid]==key){
                return mid;
            }
            else if(prefix[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low-1;
    }
    
    public int minSubArrayLen(int target, int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int[] prefix = new int[nums.length];
        
        prefix[0] = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            prefix[i] = nums[i]+prefix[i-1];
        }
        
        // we are checking that which prefix is such that the prefix[i] - searched prefix has a difference of atleast target...
        for(int i=0 ; i<prefix.length ; i++){
            if(prefix[i]==target){
                min = Math.min(min , i+1);
            }
            else if(prefix[i]>target){
                int key = prefix[i]-target;
                // searching for a prefix ...
                int idx = binary_search(prefix , key , i-1);
                min = Math.min(min , i-idx);
            }
        }
        
        
        if(min!=Integer.MAX_VALUE){
            return min;
        }
        // Time Complexity : O(n*logn)
        // Space Complexity : O(n)
        return 0;
    }
}