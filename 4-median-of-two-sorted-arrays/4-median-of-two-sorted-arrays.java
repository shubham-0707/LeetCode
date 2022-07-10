class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0 ; i<nums1.length ; i++){
            arr.add(nums1[i]);
        }
        for(int i=0 ; i<nums2.length ; i++){
            arr.add(nums2[i]);
        }
        
        Collections.sort(arr);
        int idx = arr.size()/2;
        if(arr.size()%2==1){
            
            return arr.get(idx)*1.00000;
        }
        
        double sum = arr.get(idx)*1.00000 + arr.get(idx-1)*1.00000;
        
        return sum/2;
    }
}