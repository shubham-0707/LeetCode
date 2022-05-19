class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];
        
        for(int i=0 ; i<nums1.length ; i++){
            arr1[nums1[i]]++;
        }
        
        for(int i=0 ; i<nums2.length ; i++){
            arr2[nums2[i]]++;
        }
        
       
        for(int i=0 ; i<1001 ; i++){
            if(arr1[i]>0 && arr2[i]>0){
                list.add(i);
            }
        }
        int size = list.size();
        int[] ans = new int[size];
        for(int i=0 ; i<size ; i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}