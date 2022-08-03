class Solution {
    public int missingNumber(int[] nums) {
        
        // Here we are using a hashmap approach to insert all the elements of the array nums..
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
                // if any element from 0 to n-1 is not present in the hashmap then simply return that number...
        for(int i=0 ; i<nums.length ; i++){
            if(!hash.containsKey(i)){
                return i;
            }
        }
        
        // or return the length of the array as length==n..
        return nums.length;
    }
}