class Solution {
    public int threeSumClosest(int[] nums, int x) {
        
        
        int ans = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        
        for(int i=0 ; i<nums.length-2 ; i++){
            int j=i+1;
            int k = nums.length-1;
            
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                
                if(Math.abs(x-sum)<Math.abs(x-ans)){
                    ans=sum;
                }
                if(sum>x){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        
        return ans;
        
    }
}