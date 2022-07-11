// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG
{
    public static void main (String[] args)
	{
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            
            int tree[]= new int[n];
            for(int i=0; i<n; i++)
                tree[i] = in.nextInt();
            int k = in.nextInt();
            
            Solution x = new Solution();
            System.out.println( x.find_height(tree,n,k) );
        }
	}
}// } Driver Code Ends


class Solution
{
    static int find_height(int tree[], int n, int k)
    {
        Arrays.sort(tree);
        int start = 1;
        int end = tree[tree.length-1];
        
        while(start<=end){
            int mid = (start + end)/2;
            
            int sum = 0;
            for(int i=0 ; i<tree.length ; i++){
                if((tree[i]-mid)>0){
                    sum+=(tree[i]-mid);
                }
            }
            
            if(sum==k){
                return mid;
            }
            else if(sum<k){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        
        return -1;
    }
}