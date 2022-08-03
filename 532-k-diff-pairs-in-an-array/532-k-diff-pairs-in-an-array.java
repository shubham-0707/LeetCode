class Solution {
    public int findPairs(int[] nums, int k) {
        
        int count = 0;
        LinkedHashMap<Integer , Integer> hash = new LinkedHashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        for(int i:hash.keySet()){
            if(k==0 && hash.get(i)>1){
                count++;
            }
            else if(k!=0 && hash.containsKey(i+k)){
                count++;
            }
        }
        return count;
    }
}