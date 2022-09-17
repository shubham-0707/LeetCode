class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        for(int i=0 ; i<=nums.length ; i++){
            if(!hash.containsKey(i)) return i;
        }
        
        return 0;
    }
}