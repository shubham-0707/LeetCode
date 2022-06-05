class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] prefixProd = new int[nums.length];
        int[] suffixProd = new int[nums.length];
        int prod = 1;
        for(int i=0 ; i<nums.length ; i++){
            prefixProd[i] = prod;
            prod = prod*nums[i];
        }
        prod = 1;
        for(int i=nums.length-1 ; i>=0 ; i--){
            suffixProd[i] = prod;
            prod = prod*nums[i];
        }
        
        for(int i=0 ; i<nums.length ; i++){
            ans[i] = suffixProd[i]*prefixProd[i];
        }
        return ans;
    }
}