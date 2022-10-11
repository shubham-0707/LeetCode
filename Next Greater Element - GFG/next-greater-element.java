//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here...
        
        Stack<Long> st = new Stack<>();
        Stack<Long> ans = new Stack<>();
        
        for(int i=arr.length-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                st.push(arr[i]);
                ans.push((long)-1);
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                
                if(!st.isEmpty()){
                    ans.push(st.peek());
                }
                else{
                    ans.push((long)-1);
                }
                st.push(arr[i]);
            }
        }
        
        long[] temp = new long[ans.size()];
        int x = 0;
        while(!ans.isEmpty()){
            temp[x++] = ans.pop();
        }
        
        return temp;
    } 
}