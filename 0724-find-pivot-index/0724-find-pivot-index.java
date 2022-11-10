class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
        }
        
        int prevSum = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(prevSum==(sum-prevSum-nums[i])){
                return i;
            }
            
            prevSum+=nums[i];
        }
        
        return -1;
    }
}