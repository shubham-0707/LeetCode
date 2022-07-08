class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd=0;
        int count = 0;
        
        int[] prev = new int[nums.length+1];
        
        for(int i=0 ; i<nums.length ; i++){
            prev[odd]++;
            
            if(nums[i]%2==1){
                odd++;
            }
            
            if(odd>=k){
                count+=prev[odd-k];
            }
        }
        
        return count;
    }
}