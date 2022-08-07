class Solution {
    
    public static void combinations(int idx , List<Integer> temp , List<List<Integer>> ans , int k , int n){
        if(idx==n+1){
            if(temp.size()==k){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        
        // picking...
        temp.add(idx);
        combinations(idx+1 , temp , ans , k , n);
        
        // removing last element and choosing other...
        temp.remove(temp.size()-1);
        combinations(idx+1 , temp , ans ,k , n);
    }
    
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        combinations(1 , temp , ans , k , n);
        
        return ans;
    }
}