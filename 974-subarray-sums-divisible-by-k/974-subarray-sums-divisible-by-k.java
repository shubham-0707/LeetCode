class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int count = 0;
        int sum = 0;
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        hash.put(0 , 1);
        
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            
            int rem = sum%k;
            
            if(rem<0) rem+=k;
            
            if(hash.containsKey(rem)) count+=hash.get(rem);
            
            hash.put(rem , hash.getOrDefault(rem , 0)+1);
        }
        return count;
    }
}