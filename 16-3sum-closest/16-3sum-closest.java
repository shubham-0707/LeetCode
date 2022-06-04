class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int mini = Integer.MAX_VALUE;
        int ans = mini;
        
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                for(int k=j+1 ; k<nums.length ; k++){
                    int sum = Math.abs(target-(nums[i]+nums[j]+nums[k]));
                    
                    if(mini>sum){
                        mini=sum;
                        ans = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        
        return ans;
    }
}