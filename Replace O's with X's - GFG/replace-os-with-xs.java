//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static void dfs(int row , int col , boolean[][] visited , char[][] arr){
        if(row<0 || row==arr.length || col<0 || col==arr[0].length || arr[row][col]=='X' || visited[row][col]==true) return;
        
        if(arr[row][col]=='O') visited[row][col]=true;
        
        //up
        dfs(row-1,col ,visited , arr);
        //right
        dfs(row , col+1 , visited , arr);
        //down
        dfs(row+1 , col  , visited , arr);
        //left
        dfs(row , col-1 , visited , arr);
    }
    
    static char[][] fill(int n, int m, char a[][])
    {
        // code here...
        
        boolean[][] visited = new boolean[a.length][a[0].length];
        
        for(int i=0 ; i<a[0].length ; i++){
            
            //first row...
            if(a[0][i]=='O' && visited[0][i]==false){
                dfs(0 , i , visited , a);
            }
            
            //last row...
            if(a[a.length-1][i]=='O' && visited[a.length-1][i]==false){
                dfs(a.length-1 , i , visited , a);
            }
        }
        
        
        for(int i=0 ; i<a.length ; i++){
            
            //fisrt column..
            if(a[i][0] == 'O' && visited[i][0]==false){
                dfs(i , 0 , visited , a);
            }
            
            //last column..
            if(a[i][a[0].length-1]=='O' && visited[i][a[0].length-1]==false){
                dfs(i , a[0].length-1 , visited , a);
            }
        }
        
        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<a[0].length ; j++){
                if(a[i][j]=='O' && visited[i][j]==false){
                    a[i][j] = 'X';
                }
            }
        }
        
        return a;
    }
}