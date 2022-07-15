// { Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here....
        
        int[] arr = new int[ar1.length + ar2.length];
        
        int idx1 = 0;
        int idx2 = 0;
        int len1 = ar1.length;
        int len2 = ar2.length;
        int k=0;
        
        while(idx1<len1 && idx2<len2){
            if(ar1[idx1]<ar2[idx2]){
                arr[k++] = ar1[idx1++];
            }
            else{
                arr[k++] = ar2[idx2++];
            }
        }
        
        
        while(idx1<len1){
            arr[k++] = ar1[idx1++];
        }
        
        while(idx2<len2){
            arr[k++] = ar2[idx2++];
        }
        
        int mid = arr.length/2;
        
        return arr[mid]+arr[mid-1];
    }
}