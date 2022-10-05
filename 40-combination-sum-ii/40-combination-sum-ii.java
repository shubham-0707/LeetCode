class Solution {
    
    public static void combinations(int[] arr , int index , int target , List<Integer> temp , List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=index ; i<arr.length ; i++){
            
            if(i>index && arr[i]==arr[i-1])continue;
            if(arr[i]>target) break;
            
            temp.add(arr[i]);
            combinations(arr , i+1 , target-arr[i] , temp , ans);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        
        List<Integer> temp  = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinations(arr , 0 , target , temp , ans);
        
        return ans;
    }
}