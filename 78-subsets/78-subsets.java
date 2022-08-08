class Solution {
    
    public static void subset(int idx , List<Integer> ds , HashSet<List<Integer>> set , int[] nums){
        
        if(idx==nums.length){
            set.add(new ArrayList<>(ds));
            return;
        }
        
        //picking up the element..
        ds.add(nums[idx]);
        subset(idx+1 , ds , set , nums);
        
        //leaving the element...
        ds.remove(ds.size()-1);
        subset(idx+1 , ds , set , nums);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ds = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        
        subset(0 , ds , set , nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);
        
        return ans;
    }
}