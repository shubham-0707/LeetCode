//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        
    }
    
    public static int[] prevGreater(int[] price){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        
        for(int i=0 ; i<price.length ; i++){
            if(st.isEmpty()){
                ans.push(-1);
            }
            else{
                while(!st.isEmpty() && price[st.peek()]<=price[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.push(-1);
                }
                else{
                    ans.push(st.peek());
                }
            }
            st.push(i);
        }
        
        int[] ans_arr = new int[price.length];
        for(int i=0 ; i<ans_arr.length ; i++){
            ans_arr[i] = ans.pop();
        }
        reverse(ans_arr);
        
        return ans_arr;
    }

    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here...
        
        int[] arr = prevGreater(price);
        
        int[] ans = new int[price.length];
        
        for(int i=0 ; i<ans.length ; i++){
            ans[i] = i-arr[i];
        }
        
        return ans;
        
    }
    
}