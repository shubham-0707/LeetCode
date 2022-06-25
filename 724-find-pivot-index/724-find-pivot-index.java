class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
       
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
        }
        
        int prevSum=0;
        for(int i=0 ; i<nums.length ; i++){
            if(i==0){
                prevSum=0;
            }
            else{
                prevSum+=nums[i-1];
            }
            
            
            if(prevSum == (sum-prevSum-nums[i])){
                return i;
            }
        }
        return -1;
    }
}