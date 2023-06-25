class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1 ; i<=numRows ; i++){
            int C = 1;
            List<Integer> temp = new ArrayList<>();
            for(int j=1 ; j<=i ; j++){
                temp.add(C);
                C = C * (i-j)/j;
            }

            ans.add(temp);
        }

        return ans;
    }
}