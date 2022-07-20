class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        int ans = -1;
        
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
            if(hash.get(nums[i])>(nums.length)/2){
                ans = nums[i];
                break;
            }
        }
        
        return ans;
    }
}