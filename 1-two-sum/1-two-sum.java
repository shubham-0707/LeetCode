class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int key = target - nums[i];
            
            if(hash.containsKey(key) && hash.get(key)!=i){
                ans[0] = i;
                ans[1] = hash.get(key);
                break;
            }
            
            hash.put(nums[i] , i);
        }
        return ans;
    }
}