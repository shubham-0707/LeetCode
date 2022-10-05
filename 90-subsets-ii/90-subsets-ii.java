class Solution {
    
    public static void subsets(int[] nums , int index , ArrayList<Integer> temp , Set<List<Integer>> ans){
        
        if(index==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[index]);
        subsets(nums , index+1 , temp , ans);
        
        temp.remove(temp.size()-1);
        subsets(nums , index+1 , temp, ans);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        
        subsets(nums , 0 , new ArrayList<Integer>() , ans);
        
        List<List<Integer>> sans = new ArrayList<>();
        sans.addAll(ans);
        
        return sans;
        
    }
}