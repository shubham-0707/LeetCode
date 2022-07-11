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
            int l = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[] =  new int[l];
            
            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();
            
            Solution ob = new Solution();
                
            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);
                
            else
                System.out.println(-1);    
                
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public static int binarySearch(int[] arr , int key){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public boolean findPair(int arr[], int size, int n)
    {
        //code here....
        Arrays.sort(arr);
    for(int i=0 ; i<arr.length ; i++){
        int idx = binarySearch(arr , arr[i]+n);
        if(idx!=-1 && idx!=i){
            return true;
        }
    }
    return false;
    }
}