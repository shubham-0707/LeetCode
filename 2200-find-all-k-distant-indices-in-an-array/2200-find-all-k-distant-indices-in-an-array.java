class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==key){
                ans.add(i);
            }
        }
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<nums.length ; j++){
                if(Math.abs(j-ans.get(i))<=k){
                    hash.put(j , 1);
                }
            }
        }
        
        List<Integer> arr = new ArrayList<>();
        arr.addAll(hash.keySet());
        Collections.sort(arr);
        
        return arr;
    }
}