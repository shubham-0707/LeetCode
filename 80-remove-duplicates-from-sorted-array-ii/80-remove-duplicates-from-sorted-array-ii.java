class Solution {
    public int removeDuplicates(int[] nums) {
        
        LinkedHashMap<Integer , Integer> hash = new LinkedHashMap<>();
        for(int i=0; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        int k=0;
        int sum = 0;
        for(int i:hash.keySet()){
            int a = Math.min(hash.get(i) ,2);
            sum+=a;
            for(int j=0 ; j<a ; j++){
                nums[k++]=i;
            }
        }
        return sum;
    }
}