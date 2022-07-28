class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0 ; i<nums1.length ; i++){
            set1.add(nums1[i]);
        }
        
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0 ; i<nums2.length ; i++){
            set2.add(nums2[i]);
        }
        
        HashSet<Integer> set3 = new HashSet<>();
        for(int i=0 ; i<nums3.length ; i++){
            set3.add(nums3[i]);
        }
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        for(int i:set1){
            hash.put(i , hash.getOrDefault(i , 0)+1);
        }
        
        for(int i:set2){
            hash.put(i ,hash.getOrDefault(i , 0)+1);
        }
        for(int i:set3){
            hash.put(i, hash.getOrDefault(i , 0)+1);
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i:hash.keySet()){
            if(hash.get(i)>=2){
                ans.add(i);
            }
        }
        return ans;
    }
}