class Solution {
    public void setZeroes(int[][] matrix) {
        
        // making boolean values for first row and first column..
        boolean firstRow = false;
        boolean firstCol = false;
        
        // checking in the first row..
        for(int i=0 ; i<matrix[0].length ; i++){
            if(matrix[0][i]==0){
                firstRow = true;
                break;
            }
        }
        
        // checking the first column for zeroes..
        for(int i=0 ; i<matrix.length ; i++){
            if(matrix[i][0]==0){
                firstCol = true;
            }
        }
        
        //checking and setting first row and first column as zero for indicator..
        
        for(int i=1 ; i<matrix.length ; i++){
            for(int j=1 ; j<matrix[0].length ; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        //setting the zeroes in the resultant matrix..
        for(int i=1 ; i<matrix.length ; i++){
            for(int j=1 ; j<matrix[0].length ; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        // setting the first column..
        if(firstCol){
            for(int i=0 ; i<matrix.length ; i++){
                matrix[i][0]=0;
            }
        }
        
        //setting the first row..
        if(firstRow){
            for(int i=0 ; i<matrix[0].length ; i++){
                matrix[0][i]=0;
            }
        }
        
        
    }
}