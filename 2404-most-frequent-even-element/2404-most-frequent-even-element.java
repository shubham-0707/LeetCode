class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer , Integer> tree = new TreeMap<>();
        
        for(int i=0 ; i<nums.length; i++){
            tree.put(nums[i] , tree.getOrDefault(nums[i] , 0)+1);
        }
        
        int ans = -1;
        int temp = 0;
        for(int i : tree.keySet()){
            if(i%2==0 && tree.get(i)>temp){
                temp = tree.get(i);
                ans = i;
            }
        }
        
        return ans;
    }
}