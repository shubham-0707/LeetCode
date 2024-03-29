//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here...
	    
	    int sum = 0;
	    for(int i=0 ; i<arr.length ; i++){
	        sum+=arr[i];
	    }
	    
	    boolean[][] dp = new boolean[n+1][sum+1];
	    
	    for(int i=0 ; i<dp[0].length ; i++){
	        dp[0][i] = false;
	    }
	    for(int i=0 ; i<dp.length ; i++){
	        dp[i][0] = true;
	    }
	    
	    for(int i=1 ; i<dp.length ; i++){
	        for(int j=1 ; j<dp[0].length ; j++){
	           if(arr[i-1]<=j){
	               dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
	           }
	           else{
	               dp[i][j] = dp[i-1][j];
	           }
	        }
	    }
	    
	    int target = sum/2;
	    
	    int mini = Integer.MAX_VALUE;
	    for(int i=0 ; i<=target ; i++){
	        if(dp[n][i]==true){
	            mini = Math.min(mini , sum-2*i);
	        }
	    }
	    
	    return mini;
	} 
}
