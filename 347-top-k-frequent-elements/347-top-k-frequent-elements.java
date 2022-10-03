class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Linked HashMap is used to maintain the order...
        LinkedHashMap<Integer, Integer> hash = new LinkedHashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        
        // the default order of the treemap is changed to insert in decreasing order as per the requirement of the question....
        TreeMap<Integer , ArrayList<Integer>> tree = new TreeMap<>(Collections.reverseOrder());
        
        for(int i:hash.keySet()){
            ArrayList<Integer> temp = tree.get(hash.get(i));
            
            if(temp==null){
                temp = new ArrayList<>();
                temp.add(i);
                tree.put(hash.get(i) , temp);
            }
            else{
                temp.add(i);
            }
        }
        
        
        // from here the elements equal to k are inserted in the answer array of length k...
        int[] ans = new int[k];
        int count = 0;
        int x=0;
        boolean flag = false;
        for(int i:tree.keySet()){
            for(int j=0 ; j<tree.get(i).size() ; j++){
                ans[x++] = tree.get(i).get(j);
                count++;
                if(count==k){
                    flag=true;
                    break;
                }
            }
            if(flag==true) break;
        }
        
        return ans;
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}