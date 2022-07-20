class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        HashSet<Integer> set = new HashSet<>();
        
        
        
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
            
            if(hash.get(nums[i])>Math.floor(nums.length/3)){
                set.add(nums[i]);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        ans.addAll(set);
        return ans;
        
    }
}