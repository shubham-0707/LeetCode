class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=1 ; i<=rowIndex+1 ; i++){
            long C = 1;
            List<Integer> temp = new ArrayList<>();
            for(int j=1 ; j<=i ; j++){
                temp.add((int)C);
                C = C*(i-j)/j;
            }
            ans.add(temp);
        }
        
        return ans.get(rowIndex);
        
        
    }
}