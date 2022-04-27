class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> l = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        int n = nums.length;
        double d = n/3;  
        for(int i=0 ; i<nums.length ; i++){
            int count = 0;
            for(int j=0 ; j<nums.length; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>Math.floor(d)){
                l.add(nums[i]);
            } 
        }
        
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        
        for(int i:l){
            set.add(i);
        }
        
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int j:set){
            ans.add(j);
        }
        
        return ans;
        
    }
}