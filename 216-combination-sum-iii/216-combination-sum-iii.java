class Solution {
    
    
    public static void subsets(int[] arr  , int index , ArrayList<Integer> temp , List<List<Integer>> ans , int target , int k){
        if(target<0) return;
        
        if(index==arr.length){
            if(target==0 && temp.size()==k){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        
        temp.add(arr[index]);
        subsets(arr , index+1 , temp , ans , target-arr[index] , k);
        
        
        temp.remove(temp.size()-1);
        subsets(arr , index+1 , temp , ans , target , k);
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1 , 2 , 3 , 4 , 5, 6, 7 , 8, 9};
        
        
        ArrayList<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subsets(arr , 0 , temp , ans , n , k);
        
        return ans;
    }
}