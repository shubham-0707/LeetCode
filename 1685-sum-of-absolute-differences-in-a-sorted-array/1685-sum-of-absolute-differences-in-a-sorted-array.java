class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        // by doing the mathematics  in this question we have come to a general formula i.e,
        
        // ans[i] = nums[i]*(2*i-n+1)-prefix[i]+suffix[i];
        
        //declaring and initialising the prefix array...
        int[] prefix = new int[nums.length];
        prefix[0]=0;
        // declaring and initialising the suffix array...
        int[] suffix = new int[nums.length];
        suffix[nums.length-1] = 0;
        
        for(int i=1 ; i<nums.length ; i++){
            prefix[i] = prefix[i-1]+nums[i-1];
        }
        for(int i=nums.length-2 ; i>=0 ; i--){
            suffix[i] = suffix[i+1]+nums[i+1];
        }
        
        // for(int i=0 ; i<nums.length ; i++){
        //     System.out.println(prefix[i]+" "+suffix[i]);
        // }
        
        // declaring and initialising the answer array..
        
        int[] ans = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            ans[i] = nums[i]*(2*i-nums.length+1) - prefix[i]+suffix[i];
        }
        
        return ans;
    }
}