class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        if(nums.length==1) return nums[0];
        for(int i=0 ; i<nums.length ; i++){
            int prod = nums[i];
            if(prod>ans) ans=prod;
            for(int j=i+1 ; j<nums.length ; j++){
                prod = prod*nums[j];
                if(prod>ans){
                    ans=prod;
                }
            }
        }
        return ans;
    }
}