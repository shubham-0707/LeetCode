class Solution {
    
    public static void comb_sum(int idx , int[] arr , List<List<Integer>> ans , List<Integer> temp , int sum , int target){

        if(target<0){
            return;
        }
        
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        
        // picking case..
        sum+=arr[idx];
        temp.add(arr[idx]);
        comb_sum(idx, arr , ans , temp , sum , target-arr[idx]);
        
        // not picking...
        sum-=arr[idx];
        temp.remove(temp.size()-1);
        comb_sum(idx+1 , arr , ans , temp , sum , target);
    }
    
    
    public List<List<Integer>> combinationSum(int[] arr , int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> temp = new ArrayList<>();
        
        comb_sum(0 , arr , ans , temp , 0 , target);
        
        return ans;
        
    }
}