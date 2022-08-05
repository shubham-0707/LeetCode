class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            if(hash.containsKey(target-nums[i]) && hash.get(target-nums[i])!=i){
                ans[0]=i;
                ans[1]=hash.get(target-nums[i]);
                break;
            }
            hash.put(nums[i] , i);
        }
        return ans;
    }
}