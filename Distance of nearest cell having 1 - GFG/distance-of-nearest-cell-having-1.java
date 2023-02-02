//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Helper{
    int first;
    int second;
    int third;
    
    Helper(int first, int second , int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}

class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here....
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] ans = new int[grid.length][grid[0].length];
        
        Queue<Helper> q = new LinkedList<>();
        
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j]==1){
                    visited[i][j] = true;
                    q.add(new Helper(i , j, 0));
                }
            }
        }
        
        while(!q.isEmpty()){
            Helper help = q.poll();
            int row = help.first;
            int col = help.second;
            int steps = help.third;
            
            ans[row][col] = steps;
            
            int[] delRow = {0 , -1 , 0, 1};
            int[] delCol = {-1 , 0 , 1 , 0};
            
            for(int i=0 ; i<4 ; i++){
                int newRow = row+delRow[i];
                int newCol = col+delCol[i];
                
                if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && visited[newRow][newCol]==false){
                    visited[newRow][newCol] = true;
                    q.add(new Helper(newRow , newCol , steps+1));
                }
                
            }
        }
        return ans;
    }
}