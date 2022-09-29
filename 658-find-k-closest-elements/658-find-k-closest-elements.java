class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        TreeMap<Integer, PriorityQueue<Integer>> tree = new TreeMap<>();
        
        for(int i=0 ; i<arr.length ; i++){
            int abs = Math.abs(x-arr[i]);
            
            PriorityQueue<Integer> pq = tree.get(abs);
            if(pq==null){
                pq = new PriorityQueue<Integer>();
                pq.add(arr[i]);
                tree.put(abs , pq);
            }
            else{
                pq.add(arr[i]);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        
        for(int i : tree.keySet()){
            boolean flag =  true;
            PriorityQueue<Integer> pq = tree.get(i);
            while(!pq.isEmpty()){
                ans.add(pq.poll());
                if(ans.size()==k){
                    flag = false;
                    break;
                }
            }
            
            if(flag==false) break;
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}