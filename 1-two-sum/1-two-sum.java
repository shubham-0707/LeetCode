class Solution {
    public int[] twoSum(int[] nums, int target) {
        // declaring and initialising the array...
        int[] ans = new int[2];
        // declaring the hashmap..
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        // the approach is that the if the target and target-nums[i] value are present in the hashmap with different indexes then we can say that we have got our answer...
        
        for(int i=0 ; i<nums.length ; i++){
            if(hash.containsKey(target-nums[i]) && hash.get(target-nums[i])!=i){
                ans[0]=i;
                ans[1]=hash.get(target-nums[i]);
                break;
            }
            hash.put(nums[i] , i);
        }
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
        return ans;
    }
}