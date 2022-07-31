class Solution {
  
    public List<List<Integer>> generate(int n) {
        //making resultant list..
        
        List<List<Integer>> ans = new ArrayList<>();
        
        // main operations are performed from here..
        
        for(int i=1 ; i<=n ; i++){
            //list to be inserted to the result..
            List<Integer> temp = new ArrayList<>();
            // the first element of every line will be 1;
            int C = 1;
            for(int j=1 ; j<=i ; j++){
                temp.add(C);
                C = C*(i-j)/j;
            }
            ans.add(temp);
        }
        return ans;
    }
}