// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        // your code here ....
        
        if(s.length()%2==1){
            return -1;
        }
        
        Stack<Character> st = new Stack<>();
    for(int i=0 ; i<s.length() ; i++){
        if(s.charAt(i)=='{'){
            st.push('{');
        }
        else{
            if(!st.isEmpty() && st.peek()=='{'){
                st.pop();
            }
            else{
                st.push('}');
            }
        }
    }
    
    String ans = "";
    while(!st.isEmpty()){
        ans = st.pop()+ans;
    }
    
    int count = 0;
    int i=0 ;
    int j=1;
    
    while(i<ans.length() && j<ans.length()){
        if(ans.charAt(i)=='}'){
            count++;
        }
        
        if(ans.charAt(j)=='{'){
            count++;
        }
        
        i+=2;
        j+=2;
    }
    
    return count;
    }
}