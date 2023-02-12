//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int k = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++)
                arr[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            int[] ptr = ob.kthLargest(k,arr,n);
            for(int i=0; i<n; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        // code here...
        
        int x = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
		//List<Integer> temp = new ArrayList<>();
		int[] ans = new int[arr.length];

		for(int i=0 ; i<arr.length ; i++){
			if(pq.size()<k-1){
				//System.out.print(-1+" ");
				ans[x++] = -1;
				pq.add(arr[i]);
			}
			else{
				if(pq.size()<k){
					pq.add(arr[i]);
					//System.out.print(pq.peek()+" ");
					ans[x++] = pq.peek();
				}
				else{
					if(arr[i]<=pq.peek()){
						//System.out.print(pq.peek()+" ");
						ans[x++]=pq.peek();
					}
					else{
						pq.poll();
						pq.add(arr[i]);
						ans[x++] = pq.peek();
						//System.out.print(pq.peek()+" ");
					}
				}
			}
		}
		
		return ans;
    }
};