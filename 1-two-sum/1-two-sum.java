class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0 ; i<nums.length ; i++){
            if(hash.containsKey(target-nums[i]) && hash.get(target-nums[i])!=i){
                ans[0] = hash.get(target-nums[i]);
                ans[1] = i;
                break;
            }
            
            hash.put(nums[i] , i);
        }
        
        return ans;
    }
}