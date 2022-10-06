class Solution {
    
    public static void solve(int[] nums , List<Integer> temp , Set<List<Integer>> set , boolean[] arr){
        if(temp.size()==nums.length){
            set.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0 ; i<nums.length ; i++){
            if(!arr[i]){
                arr[i] = true;
                temp.add(nums[i]);
                solve(nums , temp , set ,  arr);
                temp.remove(temp.size()-1);
                arr[i] = false;
            }
        }
    }
    
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] arr = new boolean[nums.length];
        solve(nums , temp , set , arr);
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);
        return ans;
    }
}