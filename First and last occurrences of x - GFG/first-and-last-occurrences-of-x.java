// { Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class GFG
{
    public static long SecondBinarySearch(long[] arr , int key){
        
        int start = 0;
        int end = arr.length-1;
        long ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==key){
                ans = mid;
                start=mid+1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
        }
        
        return ans;
    }
    
    public static long FirstBinarySearch(long[] arr , int key){
        
        int start = 0;
        int end = arr.length-1;
        long ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==key){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
        }
        
        return ans;
    }
    
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here...
        
        long first_idx = FirstBinarySearch(arr , x);
        long last_idx = SecondBinarySearch(arr , x);
        
        ArrayList<Long> ans = new ArrayList<>();
        ans.add(first_idx);
        ans.add(last_idx);
        
        return ans;
    }
}



// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
  // } Driver Code Ends