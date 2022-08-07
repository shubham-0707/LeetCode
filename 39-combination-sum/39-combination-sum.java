class Solution {
    public static void comb_Sum(int idx , int[] arr , List<Integer> temp , List<List<Integer>> ans , int s , int sum){
        if(sum<0){
            return;
        }
        if(idx==arr.length){
            if(sum==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        
        // picking
        s+=arr[idx];
        temp.add(arr[idx]);
        comb_Sum(idx , arr , temp , ans , s , sum-arr[idx]);
        
        
        // not picking
        s-=arr[idx];
        temp.remove(temp.size()-1);
        comb_Sum(idx+1 , arr , temp , ans , s , sum);
        
    }
    
    public List<List<Integer>> combinationSum(int[] arr , int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        comb_Sum(0 , arr , temp , ans , 0 , target);
        
        return ans;
               
    }
}