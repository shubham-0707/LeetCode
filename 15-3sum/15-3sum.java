class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        // sorting the array to reduce the loop complexity...
        Arrays.sort(arr);
        
        // using hashset to remove the duplicate values...
        HashSet<List<Integer>> set = new HashSet<>();
        
        
        // traversing from 0 to array length...
        for(int i=0 ; i<arr.length ; i++){
            HashMap<Integer , Integer> hash = new HashMap<>();
            
            for(int j=i+1 ; j<arr.length ; j++){
                
                if(hash.containsKey(0-arr[i]-arr[j])){
                    int k = hash.get(0-arr[i]-arr[j]);
                    
                    if(k==i || k==j) continue;
                    
                    else{
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        set.add(temp);
                    }
                }
                
                hash.put(arr[j] , j);
            }
        }
        
        // Adding all the set elements to a 2D list to return the answer...
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);
        
        return ans;
        
        // Time Complexity : O(N^2)
        // Space Complexity : O(N)
        
    }
}