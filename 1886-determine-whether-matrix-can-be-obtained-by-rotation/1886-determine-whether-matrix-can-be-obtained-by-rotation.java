class Solution {
    
    public boolean rotateMatrix(int[][] matrix , int[][] target){
        // swapping....
        
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=i+1 ; j<matrix[i].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // rotating...
        
        for(int i=0; i<matrix.length ; i++){
            int start = 0;
            int end = matrix[i].length-1;
            
            while(start<end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                
                
                start++;
                end--;
            }
        }
        
        
        // comparing the two matrices...
        
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]!=target[i][j]) return false;
            }
        }
        
        return true;
    }
    
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int t=0 ; t<4 ; t++){
            if(rotateMatrix(mat , target)) return true;
        }
        
        return false;
    }
}