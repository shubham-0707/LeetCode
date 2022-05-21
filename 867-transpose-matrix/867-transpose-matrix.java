class Solution {
    public int[][] transposeMatrix(int[][] matrix , int[][] B){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                B[j][i] = matrix[i][j];
            }
        }
        return B;
    }
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[][] B = new int[m][n];
        
        return transposeMatrix(matrix , B);
    }
}