class Solution {
    
    
    
    public void rotate(int[][] matrix) {
        
        //swapping values..
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=i+1 ; j<matrix.length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //rotation by 90 degree..
        for(int i=0 ; i<matrix.length ; i++){
            int start = 0;
            int end = matrix.length-1;
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