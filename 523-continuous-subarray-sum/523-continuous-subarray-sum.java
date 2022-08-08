class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        hash.put(0 , -1);
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            int rem = sum%k;
            if(hash.containsKey(rem)){
                int begIndex = hash.get(rem);
                int endIndex = i;
                
                if(endIndex-begIndex>=2){
                    return true;
                }
            }
            else{
                hash.put(rem , i);
            }
        }
        return false;
    }
}