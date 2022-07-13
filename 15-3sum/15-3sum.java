class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0 ; i<nums.length ; i++){
            HashMap<Integer , Integer> hash = new HashMap<>();
            
            for(int j=i+1 ; j<nums.length ; j++){
                
                if(hash.containsKey(0-nums[i]-nums[j])){
                    int k = hash.get(0-nums[i]-nums[j]);
                    
                    if(k==i || k==j) continue;
                    
                    else{
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        set.add(arr);
                    }
                    
                }
                
                hash.put(nums[j] , j);
                
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);
        return ans;
    }
}