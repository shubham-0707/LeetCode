// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public static long merge(long[] arr , int start , int mid , int end){
        long inv_count=0;
        long[] temp = new long[end-start+1];
        
        int i=start;
        int j = mid;
        int k = 0;
        
        while(i<mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                ++k;
                ++i;
            }
            else{
                temp[k] = arr[j];
                inv_count+=(mid-i);
                ++k;
                ++j;
            }
        }
        
        while(i<mid){
            temp[k] = arr[i];
            ++k;
            ++i;
        }
        
        while(j<=end){
            temp[k] = arr[j];
            ++k;
            ++j;
        }
        
        for(i=start , k=0 ; i<=end ; i++ , k++){
            arr[i] = temp[k];
        }
        
        
        return inv_count;
    }
    
    public static long mergeSort(long[] arr , int start , int end){
        long inv_count = 0;
        
        if(end>start){
            int mid = (start+end)/2;
            inv_count+=mergeSort(arr , start , mid);
            inv_count+=mergeSort(arr , mid+1 , end);
            inv_count+=merge(arr , start , mid+1 , end);
        }
        return inv_count;
    }
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here....
        return mergeSort(arr , 0 , arr.length-1);
    }
}