//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    static int[][] dp;
    public static int solve(int idx , int[] weight , int[] val , int wght){
        if(idx==weight.length || wght<0) return 0;
        
        
        if(dp[idx][wght]!=-1) return dp[idx][wght];
        
        int pick = 0;
        if(weight[idx]<=wght){
            pick = val[idx]+solve(idx+1 , weight , val , wght-weight[idx]);
        }
        int notPick = solve(idx+1 , weight , val , wght);
        
        return dp[idx][wght] = Math.max(pick , notPick);
    }
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here...
         
         dp = new int[wt.length+1][W+1];
         for(int[] arr: dp){
             Arrays.fill(arr , -1);
         }
         return solve(0 , wt , val , W);
    } 
}


