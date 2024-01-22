class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0)+1);
        }
        int[] ans = new int[2];
        for(int i=1 ; i<=nums.length ; i++){
            if(!hash.containsKey(i)) ans[1] = i;
            else if(hash.get(i)==2) ans[0] = i;
        }
        return ans;
    }
}