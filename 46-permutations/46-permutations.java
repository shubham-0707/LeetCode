class Solution {
    
    public static void solve(int[] nums , List<Integer> temp , List<List<Integer>> ans , boolean[] arr){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0 ; i<nums.length ; i++){
            if(!arr[i]){
                arr[i] = true;
                temp.add(nums[i]);
                solve(nums , temp , ans , arr);
                temp.remove(temp.size()-1);
                arr[i] = false;
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        boolean[] arr = new boolean[nums.length];
        solve(nums , temp , ans  , arr);
        
        return ans;
    }
}