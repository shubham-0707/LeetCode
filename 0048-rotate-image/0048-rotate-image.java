class Solution {
    public void rotate(int[][] matrix) {
        
        //swapping....
        
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=i+1 ; j<matrix[i].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // rotating...
        
        for(int i=0 ; i<matrix.length ; i++){
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
        
        
        
    }
}