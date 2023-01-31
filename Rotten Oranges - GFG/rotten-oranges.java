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
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Pair{
    int first;
    int second;
    
    Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
}

class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here.....
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int timeCount = 0;
        int count = 0;
        Queue<Pair> q = new LinkedList<Pair>();
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j]==1)count++;
                else if(grid[i][j]==2){
                    q.add(new Pair(i , j));
                }
            }
        }
        
        int[] delRow = {-1 , +1 , 0 , 0};
        int[] delCol = {0 , 0 , -1 , +1};
        
        while(!q.isEmpty()){
            timeCount++;
            int size = q.size();
            for(int i=0 ; i<size ; i++){
                Pair p = q.poll();
                int row = p.first;
                int col = p.second;
                for(int j=0 ; j<4 ; j++){
                    int newRow = row+delRow[j];
                    int newCol = col+delCol[j];
                    
                    if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && visited[newRow][newCol]==false && grid[newRow][newCol]==1){
                        visited[newRow][newCol]=true;
                        count--;
                        grid[newRow][newCol]=2;
                        q.add(new Pair(newRow , newCol));
                    }
                }
                
            }
        }
        
        
        if(count==0) return timeCount-1;
        
        return -1;
        
        
        
    }
}