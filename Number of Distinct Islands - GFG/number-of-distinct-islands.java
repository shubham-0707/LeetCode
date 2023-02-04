//{ Driver Code Starts
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
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java..


class Solution {
    
    public void dfs(int row , int col , boolean[][] visited , int[][] grid , List<String> list , int row0, int col0){
        visited[row][col]=true;
        list.add(toString(row-row0 , col-col0));
        
        int[] delRow = {0 , -1 , 0 , 1};
        int[] delCol = {-1 , 0 , 1 , 0};
        
        for(int i=0 ; i<4 ; i++){
            int newRow = row+delRow[i];
            int newCol = col+delCol[i];
            
            if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && visited[newRow][newCol]==false && grid[newRow][newCol]==1){
                dfs(newRow , newCol , visited , grid , list , row0 , col0);
            }
        }
    }
    
    public String toString(int row , int col){
        return Integer.toString(row)+" "+Integer.toString(col);
    }

    int countDistinctIslands(int[][] grid) {
        // Your Code here...
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Set<List<String>> set = new HashSet<>();
        
        
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    List<String> list = new ArrayList<>();
                    dfs(i , j , visited , grid , list , i , j);
                    set.add(list);
                }
            }
        }
        
        return set.size();
    }
}
