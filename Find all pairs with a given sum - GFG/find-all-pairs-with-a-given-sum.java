// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long N = Long.parseLong(stt.nextToken());
            long M = Long.parseLong(stt.nextToken());
            long X = Long.parseLong(stt.nextToken());
            long A[] = new long[(int)(N)];
            long B[] = new long[(int)(M)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < M; i++) {
                B[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            pair [] answer = obj.allPairs(A, B, N, M, X);
            int sz = answer.length;
            
            if(sz==0)
            System.out.println(-1);
            else{
                StringBuilder output = new StringBuilder();
                for(int i=0;i<sz;i++){
                    if(i<sz-1)
                    output.append(answer[i].first +" "+ answer[i].second + ", ");
                    else
                    output.append(answer[i].first +" "+ answer[i].second);
                    
                }
                System.out.println(output);
            }
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here...
        Arrays.sort(A);
        Arrays.sort(B);
        HashMap<Long , Integer> hash = new HashMap<>();
        ArrayList<pair> ans = new ArrayList<>();
        for(int i=0 ; i<B.length ; i++){
            hash.put(B[i] , hash.getOrDefault(B[i] , 0)+1);
        }
        
        for(int i=0 ; i<A.length ; i++){
            if(hash.containsKey(X-A[i])){
                ans.add(new pair(A[i] , X-A[i]));
            }
            
            if(hash.get(X-A[i])!=null && hash.get(X-A[i])==1){
                hash.remove(X-A[i]);
            }
            else if(hash.get(X-A[i])!=null && hash.get(X-A[i])>1){
                hash.put(X-A[i] , hash.get(X-A[i])-1);
            }
        }
        
        pair[] list = new pair[ans.size()];
        
        return ans.toArray(list);
    }
}