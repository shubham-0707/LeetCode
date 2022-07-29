class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        // Using hashset to avoid the problem pf duplicacy..
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0 ; i<(1<<nums.length) ; i++){
            List<Integer> lst = new ArrayList<>();
            
            for(int j=0 ; j<nums.length ; j++){
                if((i&(1<<j))>0){
                    lst.add(nums[j]);
                }
            }
            Collections.sort(lst);
            set.add(lst);
        }
        
        // Adding the elements of the hashset in the resultant list...
        List<List<Integer>> result = new ArrayList<>();
        result.addAll(set);
        
        return result;
    }
}