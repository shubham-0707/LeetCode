// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here...
        
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer , Integer> hash = new  HashMap<>();
        
        for(int i=0 ; i<k ; i++){
            hash.put(A[i] , hash.getOrDefault(A[i] , 0)+1);
        }
        
        arr.add(hash.size());
        int x = 0;
        
        for(int i=k ; i<A.length ; i++){
            if(hash.get(A[x])==1){
                hash.remove(A[x]);
            }
            else{
                hash.put(A[x] , hash.get(A[x])-1);
            }
            
            hash.put(A[i] , hash.getOrDefault(A[i] , 0)+1);
            arr.add(hash.size());
            x++;
        }
        
        return arr;
    }
}

