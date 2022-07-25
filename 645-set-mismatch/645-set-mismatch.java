class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        //int maxi = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
            //maxi = Math.max(maxi , nums[i]);
        }
        
        int[] ans = new int[2];
        for(int i=1 ; i<=nums.length ; i++){
            if(hash.get(i)==null){
                ans[1]=i;
            }
            if(hash.containsKey(i)&&hash.get(i)==2){
                ans[0] = i;
            }
        }
        return ans;
    }
}