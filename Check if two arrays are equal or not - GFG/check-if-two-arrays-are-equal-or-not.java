// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here....
        HashMap<Long , Integer> hash1 = new HashMap<>();
        for(int i=0 ; i<A.length ; i++){
            hash1.put(A[i] , hash1.getOrDefault(A[i] , 0)+1);
        }
        
        HashMap<Long , Integer> hash2 = new HashMap<>();
        for(int i=0 ; i<B.length ; i++){
            hash2.put(B[i] , hash2.getOrDefault(B[i] , 0)+1);
        }
        
        for(int i=0 ; i<N ; i++){
            if(hash1.get(A[i])!=hash2.get(A[i]) || hash1.get(B[i])!=hash2.get(B[i])){
                return false;
            }
        }
        
        if(A.length == B.length)return true;
        
        return false;
        
    }
}