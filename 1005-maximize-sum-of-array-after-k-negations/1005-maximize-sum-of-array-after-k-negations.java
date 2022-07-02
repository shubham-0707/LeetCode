class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
       
        Arrays.sort(nums);
        
        if(nums[0]<0){
            for(int i=0 ; i<nums.length && k>0 && nums[i]<0 ; i++){
                nums[i] = -nums[i];
                k--;
            }
        }
        
        Arrays.sort(nums);
        if(k%2==1){
            nums[0]=-nums[0];
        }
        
        int sum = 0;
        for(int j=0 ; j<nums.length ; j++){
            sum+=nums[j];
        }
        return sum;
    }
}