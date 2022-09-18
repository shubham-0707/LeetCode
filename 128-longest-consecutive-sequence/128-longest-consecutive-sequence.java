class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0) return 0;
        
        TreeMap<Integer , Integer> hash = new TreeMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        int maxi = 0;
        int count = 1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:hash.keySet()){
            ans.add(i);
        }
        
        for(int i=1 ; i<ans.size() ; i++){
            if(ans.get(i)==ans.get(i-1)+1){
                count++;
            }
            else{
                maxi = Math.max(maxi , count);
                count=1;
            }
        }
        
        maxi = Math.max(maxi , count);
        
        return maxi;
        
    }
}