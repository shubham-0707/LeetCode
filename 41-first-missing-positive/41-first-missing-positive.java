class Solution {
    public int firstMissingPositive(int[] nums) {
        
        // Using the hashmap will solve the problem...
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        for(int i=1 ; i<=nums.length ; i++){
            if(!hash.containsKey(i)){
                return i;
            }
        }
        
        return nums.length+1;
    }
}