class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=1 ; i<=n ; i++){
            List<Integer> arr = new ArrayList<>();
            int C = 1;
            for(int j=1 ; j<=i ; j++){
                arr.add(C);
                C = C*(i-j)/j;
            }
            ans.add(arr);
        }
        return ans;
    }
}