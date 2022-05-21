class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                int x = i;
                int y = j;
                while(x<matrix.length && y<matrix[0].length){
                    if(matrix[x][y]!=matrix[i][j]){
                        return false;
                    }
                    x++;
                    y++;
                }
            }
        }
        return true;
    }
}