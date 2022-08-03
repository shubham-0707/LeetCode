class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        
        // Making a HashMap..
        HashMap<Integer , Integer> hash = new HashMap<>();
        hash.put(0 , 1);
        int sum = 0;
        int ans = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            
            int rem = sum%k;
            if(rem<0){
                rem+=k;
            }
            
            if(hash.containsKey(rem)){
                ans+=hash.get(rem);
                hash.put(rem , hash.get(rem)+1);
            }
            else{
                hash.put(rem,1);
            }
        }
        return ans;
    }
}