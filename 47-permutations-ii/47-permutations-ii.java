class Solution {
    
    public static void permutation(int[] nums , List<Integer> ds , HashSet<List<Integer>> set , boolean[] hash){
        if(ds.size()==nums.length){
            set.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0 ; i<nums.length ; i++){
            if(!hash[i]){
                hash[i]=true;
                ds.add(nums[i]);
                permutation(nums , ds , set , hash);
                ds.remove(ds.size()-1);
                hash[i]=false;
            }
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> ds = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        boolean[] hash = new boolean[nums.length];
        permutation(nums  , ds , set , hash);
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);
        return ans;
    }
}