class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0 ; i<m ; i++){
            arr.add(nums1[i]);
        }
        for(int i=0 ; i<n ; i++){
            arr.add(nums2[i]);
        }
        
        for(int i=0 ; i<arr.size() ; i++){
            nums1[i]=arr.get(i);
        }
        Arrays.sort(nums1);
    }
}