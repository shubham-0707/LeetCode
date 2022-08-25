class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        int MOD = 1000000009;
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=1 ; i<=rowIndex+1 ; i++){
            List<Integer> temp = new ArrayList<>();
            long C = 1;
            for(int j=1 ; j<=i ; j++){
                temp.add((int)C);
                C = C*(i-j)/j;
            }
            ans.add(temp);
        }
        
        return ans.get(rowIndex);
        
    }
}