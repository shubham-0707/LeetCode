class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashMap<Integer , Integer> hash1 = new HashMap<>();
        HashMap<Integer , Integer> hash2 = new HashMap<>();
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0 ; i<nums1.length ; i++){
            hash1.put(nums1[i] , hash1.getOrDefault(nums1[i] , 0)+1);
        }
        
        for(int i=0 ; i<nums2.length ; i++){
            hash2.put(nums2[i] , hash2.getOrDefault(nums2[i] , 0)+1);
        }
        
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0 ; i<nums1.length ; i++){
            if(hash2.containsKey(nums1[i])==false){
                set1.add(nums1[i]);
            }
        }
        
        ans.add(new ArrayList<Integer>(set1));
        
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i=0 ; i<nums2.length ; i++){
            if(hash1.containsKey(nums2[i])==false){
                set2.add(nums2[i]);
            }
        }
        ans.add(new ArrayList<Integer>(set2));
        
        return ans;
    }
}