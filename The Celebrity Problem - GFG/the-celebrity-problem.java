// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here....
    	
    	Stack<Integer> st = new Stack<>();
    	
    	for(int i=0 ; i<n ; i++){
    	    st.push(i);
    	}
    	
    	while(st.size()>1){
    	    int a = st.peek();
    	    st.pop();
    	    int b = st.peek();
    	    st.pop();
    	    
    	    if(M[a][b]==1){
    	        st.push(b);
    	    }
    	    else{
    	        st.push(a);
    	    }
    	}
    	
    	int candidate = st.peek();
    	int zeroCount=0;
    	int oneCount=0;
    	boolean rowVerify=false;
    	boolean colVerify = false;
    	
    	
    	for(int i=0 ; i<n ; i++){
    	    if(M[candidate][i]==0){
    	        zeroCount++;
    	    }
    	}
    	if(zeroCount==n){
    	    rowVerify=true;
    	}
    	
    	for(int i=0 ; i<n ; i++){
    	    if(M[i][candidate]==1){
    	        oneCount++;
    	    }
    	}
    	
    	if(oneCount==n-1){
    	    colVerify=true;
    	}
    	
    	if(rowVerify==true && colVerify==true){
    	    return candidate;
    	}
    	
    	return -1;
    	
    }
}