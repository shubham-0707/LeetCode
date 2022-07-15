// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public static int binarySearch(int key , int[] arr , int start , int end ){
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        
        return -1;
    }
    
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<end){
            int mid = start + (end-start)/2;
            
            if(arr[0]<=arr[mid]){
                ans = mid;
                start=mid+1;
            }
            else{
                end = mid;
            }
        }
        
        return ans;
    }
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function...
        int ans = -1;
        int pivot = findPivot(A);
        
        if(key>=A[0] && key<=A[pivot]){
            ans = binarySearch(key , A , 0 , pivot);
        }
        else{
            ans = binarySearch(key , A , pivot+1 , A.length-1);
        }
        return ans;
    }
}