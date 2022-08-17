class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[i].length ; j++){
                arr.add(mat[i][j]);
            }
        }
        
        if(mat.length*mat[0].length == r*c){
            int x = 0;
        int[][] ans = new int[r][c];
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                ans[i][j] = arr.get(x);
                x++;
            }
        }
        
        return ans;
        }
        return mat;
    }
}