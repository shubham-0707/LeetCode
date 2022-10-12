class Solution {
    public int[] productExceptSelf(int[] nums) {
        // The intution to solve this question is that if we make a prefix product array and a suffix product array to calculate the answer array..
        
        int[] ans = new int[nums.length];
        int[] prefix_prod = new int[nums.length];
        int[] suffix_prod = new int[nums.length];
        
        int prod = 1;
        for(int i=0 ; i<nums.length ; i++){
            prefix_prod[i] = prod;
            prod = prod*nums[i];
        }
        
        prod = 1;
        for(int i=nums.length-1 ; i>=0 ; i--){
            suffix_prod[i] = prod;
            prod = prod*nums[i];
        }
        
        for(int i=0 ; i<nums.length ; i++){
            ans[i] = prefix_prod[i]*suffix_prod[i];
        }
        
        return ans;
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}