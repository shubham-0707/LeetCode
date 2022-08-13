class Solution {
    public int findShortestSubArray(int[] nums) {
        
        int degree = 1;
        HashMap<Integer , Integer> hash1 = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            hash1.put(nums[i] , hash1.getOrDefault(nums[i] , 0)+1);
            degree = Math.max(degree , hash1.get(nums[i]));
        }
        
        HashMap<Integer , Integer> hash2 = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            if(hash1.get(nums[i])==degree && !hash2.containsKey(nums[i])){
                hash2.put(nums[i] , i);
            }
        }
        
        HashMap<Integer , Integer> hash3 = new HashMap<>();
        int length = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            hash3.put(nums[i] , hash3.getOrDefault(nums[i] , 0)+1);
            if(hash3.get(nums[i])==degree){
                length = Math.min(length  , i-hash2.get(nums[i])+1);
            }
        }
        
        return length;
    }
}