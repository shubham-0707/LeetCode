class Solution {
    public int[] runningSum(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sum = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            sum = sum+nums[i];
            arr.add(sum);
        }
        
        // to convert Integer arrayList to int array..
        return arr.stream().mapToInt(i -> i).toArray();
    }
}