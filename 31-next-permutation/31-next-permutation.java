class Solution {
    public void nextPermutation(int[] nums) {
        
        int infpt = 0;
        
        for(int i=nums.length-1 ; i>0 ; i--){
            if(nums[i-1]<nums[i]){
                infpt = i;
                break;
            }
        }
        
        if(infpt==0){
            Arrays.sort(nums);
        }
        else{
            int toSwap = nums[infpt-1];
            int mini = Integer.MAX_VALUE;
            
            for(int i=infpt ; i<nums.length ; i++){
                if(nums[i]>toSwap && nums[i]-toSwap<mini){
                    int temp = nums[i];
                    nums[i] = nums[infpt-1];
                    nums[infpt-1] = temp;
                }
            }
            Arrays.sort(nums, infpt , nums.length);
        }
        
        
    }
}