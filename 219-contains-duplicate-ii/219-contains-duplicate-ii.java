class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // we are going to solve this question with the help of hashmaps...
        HashMap<Integer , Integer> hash1 = new HashMap<>();
        HashMap<Integer  , Integer> hash2 = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            hash1.put(nums[i] , hash1.getOrDefault(nums[i] , 0)+1);
            if(hash1.get(nums[i])>1 && Math.abs(i-hash2.get(nums[i]))<=k){
                return true;
            }
            hash2.put(nums[i] , i);
        }
        return false;
    }
}