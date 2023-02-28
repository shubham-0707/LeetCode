//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    ArrayList <ArrayList<Integer>> res = new solve().AllSubsets(arr,n);
		    for (int i = 0; i < res.size (); i++)
		    {
		        System.out.print ("(");
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		            if (j != res.get(i).size()-1)
		                System.out.print ((res.get(i)).get(j) + " ");
		            else
		                System.out.print ((res.get(i)).get(j));
		        }
		        System.out.print (")");
		      
		    }
		    System.out.println();
		}
	}
}
// } Driver Code Ends


class solve
{
    //Function to find all possible unique subsets.
    
    public static void solve(int idx , int[] arr , ArrayList<Integer> temp , ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        
        for(int i=idx ; i<arr.length ; i++){
            if(i>idx && arr[i-1]==arr[i])continue;
            
            temp.add(arr[i]);
            solve(i+1 , arr , temp, ans);
            temp.remove(temp.size()-1);
        }
        
        return;
    }
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        // your code here...
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        solve(0 , arr , temp , ans);
        
        return ans;
    }
}
