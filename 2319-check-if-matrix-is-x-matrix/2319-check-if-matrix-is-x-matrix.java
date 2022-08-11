class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length+1;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid.length ; j++){
                if(i==j && grid[i][j]==0){
                    return false;
                }
                else if((i+1)+(j+1)==n && grid[i][j]==0){
                    return false;
                }
                else if((i!=j) && ((i+1)+(j+1)!=n) && grid[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}