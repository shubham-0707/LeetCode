//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here...
        int maxi = 0;
        int ans = -1;
        
        for(int i=0 ; i<arr.length ; i++){
            
            int index = binarySearch(arr[i] , 1);
            if(index!=-1 && arr[i].length-index>maxi){
                maxi = arr[i].length-index;
                ans = i;
            }
        }
        
        return ans;
    }
}