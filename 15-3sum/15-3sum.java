class Solution {
    
    
   
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        
        for(int i=0 ; i<nums.length ; i++){
            
            HashMap<Integer , Integer> hash = new HashMap<>();
            for(int j=i+1 ; j<nums.length ; j++){
                if(hash.containsKey(0-nums[i]-nums[j])){
                    
                    int k = hash.get(0-nums[i]-nums[j]);
                    
                    if(k==i || k==j) continue;
                    
                    
                    else{
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    }
                    
                }
                hash.put(nums[j] , j);
            }
        }
        List<List<Integer>> ans2 = new ArrayList<>();
        ans2.addAll(ans);
        return ans2;
    }
}