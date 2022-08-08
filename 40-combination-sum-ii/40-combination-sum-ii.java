class Solution {
    
    public static void combinationSum(int idx , List<Integer> ds , List<List<Integer>> ans , int target , int[] arr){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=idx ; i<arr.length ; i++){
            if(i>idx && arr[i]==arr[i-1])
                continue;
            if(target<arr[i])
                break;
            
            ds.add(arr[i]);
            combinationSum(i+1 , ds , ans , target-arr[i] , arr);
            ds.remove(ds.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        combinationSum(0 , ds , ans , target , candidates);
        
        return ans;
    }
}