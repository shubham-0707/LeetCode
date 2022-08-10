class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        int count = 0;
        int maxi = 0;
        
        for(int i:hash.keySet()){
            if(!hash.containsKey(i-1)){
                count=1;
                int num = i+1;
                while(hash.containsKey(num)){
                    count++;
                    num++;
                }
                maxi = Math.max(maxi , count);
            }
        }
        return maxi;
    }
}