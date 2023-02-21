//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // Your code goes here....
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        
        Arrays.sort(arr);
        
        boolean flag = true;
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<arr.length ; i++){
            if(flag){
                str1.append((char)(arr[i]+'0'));
                flag = false;
            }
            else{
                str2.append((char)(arr[i]+'0'));
                flag = true;
            }
        }
    
        
        long sum = 0;
        if(str1.toString().length()>0){
            sum+=Long.parseLong(str1.toString());
        }
        if(str2.toString().length()>0){
            sum+=Long.parseLong(str2.toString());
        }
        //long sum = Integer.valueOf(str1.toString()) + Integer.valueOf(str2.toString());
        
        return sum;
    }
}