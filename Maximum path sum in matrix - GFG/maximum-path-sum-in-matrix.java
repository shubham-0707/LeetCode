//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    private static int[][] dp;
    
    public static int solve(int row , int col , int[][] matrix){
        if(row<0 || row>=matrix.length || col<0 || col>=matrix[0].length) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        
        int leftD = matrix[row][col]+solve(row+1 , col-1 , matrix);
        int straight = matrix[row][col] + solve(row+1 , col , matrix);
        int rightD = matrix[row][col] + solve(row+1 , col+1 , matrix);
        
        return dp[row][col] = Math.max(leftD , Math.max(straight , rightD));
    }
    
    static int maximumPath(int N, int matrix[][])
    {
        // code here....
        dp = new int[matrix.length][matrix[0].length];
        
        for(int[] arr:dp){
            Arrays.fill(arr , -1);
        }
        
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0 ; i<matrix[0].length ; i++){
            maxi = Math.max(maxi , solve(0 , i , matrix));
        }
        return maxi;
    }
}