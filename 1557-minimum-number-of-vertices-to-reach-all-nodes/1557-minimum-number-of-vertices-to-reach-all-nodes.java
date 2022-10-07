class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges){
        List<Integer> ans = new ArrayList<>();

        boolean[] inComingEdge = new boolean[n];
        Arrays.fill(inComingEdge,false);

        for(int i = 0; i < edges.size(); i++)
            inComingEdge[edges.get(i).get(1)] = true;

        for(int i = 0; i < n; i++)
            if(inComingEdge[i] == false) ans.add(i);  

        return ans;     
    }
}