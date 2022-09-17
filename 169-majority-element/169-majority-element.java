class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] ,0)+1);
        }
        
        for(int i:hash.keySet()){
            if(hash.get(i)>nums.length/2){
                return i;
            }
        }
        
        return 0;
    }
}