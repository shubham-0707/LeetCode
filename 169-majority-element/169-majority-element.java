class Solution {
    public int majorityElement(int[] nums) {
        
        // use hashmap to store the frequency of each element...
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        // checking the majority element and updating the answer variable...
        int ans = 0;
        for(int i:hash.keySet()){
            if(hash.get(i)>(nums.length/2)){
                ans=i;
                break;
            }
        }
        
        return ans;
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
        
    }
}