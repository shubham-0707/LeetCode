// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here...
        int ans = -1;
        
        long sum = 0;
        
        for(int i=0 ; i<arr.length ; i++){
            sum+=arr[i];
        }
        
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(i==0) leftSum = 0;
            else leftSum+=arr[i-1];
            if(i==arr.length-1) rightSum = 0;
            else rightSum = (int)(sum-leftSum-arr[i]);
            
            if(leftSum==rightSum){
                ans = i+1;
                break;
            }
            
        }
        
        return ans;
    }
}
