class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int i=0 ; i<nums.length ; i++){
            HashMap<Integer , Integer> hash = new HashMap<>();
            for(int j=i+1 ; j<nums.length ; j++){
                int target = 0-nums[i]-nums[j];
                
                if(hash.containsKey(target)){
                    int k = hash.get(target);
                    
                    if(k==i || k==j) continue;
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        set.add(temp);
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