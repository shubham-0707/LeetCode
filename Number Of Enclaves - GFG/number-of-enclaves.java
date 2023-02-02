//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.numberOfEnclaves(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public void dfs(int row , int col , boolean[][] visited , int[][] grid){
        if(row<0 || row==grid.length || col<0 || col==grid[0].length || visited[row][col]==true || grid[row][col]==0) return;
        
        if(grid[row][col]==1) visited[row][col]=true;
        
        dfs(row-1 , col , visited , grid);
        dfs(row , col+1 , visited , grid);
        dfs(row+1 , col , visited , grid);
        dfs(row , col-1 , visited , grid);
    }

    int numberOfEnclaves(int[][] grid) {

        // Your code here...
        boolean[][] visited  = new boolean[grid.length][grid[0].length];
        
        for(int i=0 ; i<grid[0].length ; i++){
            if(grid[0][i]==1 && visited[0][i]==false){
                dfs(0 , i , visited , grid);
            }
            
            if(grid[grid.length-1][i]==1 && visited[grid.length-1][i]==false){
                dfs(grid.length-1 , i , visited , grid);
            }
        }
        
        for(int i=0 ; i<grid.length ; i++){
            
            if(grid[i][0]==1 && visited[i][0]==false){
                dfs(i, 0 , visited, grid);
            }
            
            if(grid[i][grid[0].length-1]==1 && visited[i][grid[0].length-1]==false){
                dfs(i , grid[0].length-1 , visited , grid);
            }
        }
        
        
        int count = 0;
        
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j]==1 && visited[i][j]==false){
                    count++;
                }
            }
        }
        
        return count;
    }
}