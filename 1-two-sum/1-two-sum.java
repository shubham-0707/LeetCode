class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //making an answer array...
        int[] ans = new int[2];
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int key = target - nums[i];
            if(hash.containsKey(key) && hash.get(key)!=i){
                ans[0] = hash.get(key);
                ans[1] = i;
                break;
            }
            hash.put(nums[i] , i);
        }
        return ans;
    }
}