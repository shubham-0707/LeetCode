// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here....
        Arrays.sort(arr);
        
        String ans = "";
        String temp1 = arr[0];
        String temp2 = arr[arr.length-1];
        
        for(int i=0 ; i<temp1.length() ; i++){
            if(temp1.charAt(i)==temp2.charAt(i)){
                ans+=temp1.charAt(i);
            }
            else{
                break;
            }
        }
        
        if(ans.length()==0){
            return "-1";
        }
        
        return ans;
    }
}