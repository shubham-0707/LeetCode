class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        Arrays.sort(arr);
        
        HashSet<List<Integer>> set = new HashSet<>();
        
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
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);
        
        return ans;
        
    }
}