//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

class Pair{
    int value;
    int parent;
    
    
    Pair(int value , int parent){
        this.value = value;
        this.parent = parent;
    }
}

class Solution {
    
    
    public boolean checkCycle(int source , int V , ArrayList<ArrayList<Integer>> adjList , boolean[] visited){
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(source , -1));
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            int curr = p.value;
            int par = p.parent;
            visited[curr] = true;
            
            for(int i=0 ; i<adjList.get(curr).size() ; i++){
                int x = adjList.get(curr).get(i);
                
                if(!visited[x]){
                    visited[x] = true;
                    q.add(new Pair(x , curr));
                }
                else if(visited[x]==true && x!=par) return true;
            }
        }
        
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here......
        
        boolean[] visited = new boolean[V];
        
        for(int i=0 ; i<V ; i++){
            if(!visited[i]){
                if(checkCycle(i , V , adj , visited)) return true;
            }
        }
        return false;
    }
}