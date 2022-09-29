class Solution {
    public int findClosestNumber(int[] nums) {
        TreeMap<Integer , Integer> tree  = new TreeMap<>();
        
        for(int i=0 ; i<nums.length; i++){
            int abs = Math.abs(0-nums[i]);
            
            if(tree.get(abs)==null || tree.get(abs)<nums[i]){
                tree.put(abs , nums[i]);
            }
            
        }
        
        int ans = 0;
        for(int i:tree.keySet()){
            ans = tree.get(i);
            break;
        }
        
        return ans;
    }
}