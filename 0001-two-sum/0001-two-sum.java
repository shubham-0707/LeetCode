class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            int key = target - nums[i];
            if(hash.containsKey(key)){
                int[] ans = new int[2];
                ans[0] = i;
                ans[1] = hash.get(key);
                return ans;
            }
            
            if(!hash.containsKey(nums[i])){
                hash.put(nums[i] , i);
            }
        }
        
        return new int[0];
    }
}