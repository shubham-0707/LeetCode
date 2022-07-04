// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here....
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        int currSum = 0;
        int start = 1;
        int end = -1;
        for(int i=0 ; i<arr.length ; i++){
            currSum+=arr[i];
            
            if((currSum-s)==0){
                ans.add(1);
                ans.add(i+1);
                end = 1;
                break;
            }
            else if(hash.containsKey(currSum-s)){
                ans.add(hash.get(currSum-s)+2);
                ans.add(i+1);
                end = 1;
                break;
            }
            
            hash.put(currSum , i);
        }
        
        if(end==-1){
            ans.add(-1);
        }
        
        return ans;
    }
}