class Solution {
    public static boolean isValid(int[][] matrix , int x , int row , int col){
        for(int i=0 ; i<matrix.length ; i++){
            if(matrix[row][i]==x && i!=col){
                return false;
            }
            if(matrix[i][col]==x && i!=row){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkValid(int[][] matrix) {
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix.length ; j++){
                if(isValid(matrix , matrix[i][j] , i , j)==false){
                    return false;
                }
            }
        }
        return true;
    }
}