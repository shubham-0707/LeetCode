class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        
        HashMap<Integer , Integer> winner = new HashMap<>();
        HashMap<Integer , Integer> losser = new HashMap<>();
        for(int i=0 ; i<matches.length ; i++){
            winner.put(matches[i][0] , winner.getOrDefault(matches[i][0] , 0)+1);
            losser.put(matches[i][1] , losser.getOrDefault(matches[i][1] , 0)+1);
        }
        
      
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        
        for(int i : winner.keySet()){
            if(!losser.containsKey(i)){
                arr1.add(i);
            }
        }
        
        for(int i : losser.keySet()){
            if(losser.get(i)==1){
                arr2.add(i);
            }
        }
        
        
        Collections.sort(arr1);
        Collections.sort(arr2);
        
        
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(arr1);
        ans.add(arr2);
        return ans;
        
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
        
    }
}