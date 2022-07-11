// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here...
        
        int[] left_max = new int[arr.length];
        int[] right_max = new int[arr.length];
        
        left_max[0] = arr[0];
        right_max[arr.length-1] = arr[arr.length-1];
        
        for(int i=1 ; i<n ; i++){
            left_max[i] = Math.max(arr[i] , left_max[i-1]); 
        }
        
        for(int i=n-2 ; i>=0 ; i--){
            right_max[i] = Math.max(arr[i] , right_max[i+1]);
        }
        
        long ans = 0;
        
        for(int i=1 ; i<n ; i++){
            ans+=Math.min(left_max[i] , right_max[i]) - arr[i];
        }
        
        return ans;
    } 
}


