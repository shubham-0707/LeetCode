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
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    
        public boolean solve(int row , int col , char[][] board , String word  , int idx , boolean[][] visited){
        if(idx==word.length()) return true;
        if(row<0 || row>=board.length || col<0 || col>=board[0].length) return false;
        if(board[row][col]!=word.charAt(idx)) return false;
        if(visited[row][col]) return false;

        visited[row][col] = true;
        boolean up = solve(row-1 , col , board , word , idx+1 , visited);
        boolean right = solve(row , col+1 , board , word , idx+1 , visited);
        boolean down = solve(row+1 , col , board , word , idx+1 , visited);
        boolean left = solve(row , col-1 , board , word , idx+1 , visited);

        visited[row][col] = false;

        return up||right||down||left;
    }
    
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here..
        
                for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[0].length ; j++){
                boolean[][] visited = new boolean[board.length][board[0].length];
                if(board[i][j]==word.charAt(0)){
                    if(solve(i , j , board , word , 0 , visited)) return true;
                }
            }
        }

        return false;
    }
}