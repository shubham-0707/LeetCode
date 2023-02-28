//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            long[] arr = new long[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            long ans = new Solution().findSmallest(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution {
    long findSmallest(long[] arr, int n) {
        // code here...
        
        long maxPossible = 0;
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>maxPossible+1){
                return maxPossible+1;
            }
            maxPossible+=arr[i];
        }
        
        return maxPossible+1;
    }
}
