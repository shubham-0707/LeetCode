class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        hash.put(0, 1);
        
        int count = 0;
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            
            if(hash.containsKey(sum-k)){
                count+=hash.get(sum-k);
            }
            
            hash.put(sum , hash.getOrDefault(sum , 0)+1);
        }
        return count;
    }
}