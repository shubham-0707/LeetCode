class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer , Integer> hash  = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums[i].length ; j++){
                hash.put(nums[i][j] , hash.getOrDefault(nums[i][j] , 0)+1);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i : hash.keySet()){
            if(hash.get(i)==nums.length){
                ans.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}