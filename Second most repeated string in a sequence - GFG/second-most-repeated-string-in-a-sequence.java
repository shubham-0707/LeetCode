// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here...
        
        HashMap<String , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<N ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1); 
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(String i : hash.keySet()){
            ans.add(hash.get(i));
        }
        
        Collections.sort(ans);
        
        int count = ans.get(ans.size()-2);
        
        String main_ans="";
        for(String i:hash.keySet()){
            if(hash.get(i)==count){
                main_ans=i;
            }
        }
        
        return main_ans;
    }
}