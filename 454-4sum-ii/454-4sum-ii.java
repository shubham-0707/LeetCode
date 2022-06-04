class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        HashMap<Integer , Integer> hash = new HashMap<>(0);
        for(int i=0 ; i<nums1.length ; i++){
            for(int j=0 ; j<nums2.length ; j++){
                int sum = nums1[i]+nums2[j];
                if(hash.get(sum)==null){
                    hash.put(sum , 1);
                }
                else{
                    hash.put(sum , hash.get(sum)+1);
                }
            }
        }
        
        int count = 0;
        for(int i=0 ; i<nums3.length ; i++){
            for(int j=0 ; j<nums4.length ; j++){
                int sum = -1*(nums3[i]+nums4[j]);
                
                if(hash.containsKey(sum)){
                    count+=hash.get(sum);
                }
            }
        }
        return count;
    }
}