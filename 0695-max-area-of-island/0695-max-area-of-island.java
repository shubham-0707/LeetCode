class Solution {
    int[][] grid;
    boolean[][] seen;
    
    
    public int solve(int row , int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || seen[row][col]==true || grid[row][col]==0) return 0;
        
        seen[row][col] = true;
        
        return(1+solve(row+1 , col) + solve(row-1 , col)+
                 solve(row , col+1) + solve(row , col-1));
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        this.seen = new boolean[grid.length][grid[0].length];
        this.grid = grid;
        
        int maxi = 0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                maxi = Math.max(maxi , solve(i , j));
            }
        }
        
        return maxi;
    }
}