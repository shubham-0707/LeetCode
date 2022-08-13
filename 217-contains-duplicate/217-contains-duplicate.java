class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        // here we are approaching this question with the help of hashmap in java....
        
        HashMap<Integer , Integer > hash = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
            if(hash.get(nums[i])==2){
                return true;
            }
        }
        return false;
    }
}