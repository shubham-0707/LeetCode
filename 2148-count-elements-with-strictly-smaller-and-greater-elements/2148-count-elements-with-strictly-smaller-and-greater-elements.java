class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length==1 || nums[0]==nums[nums.length-1]){
            return 0;
        }
        
        int start = 0;
        int end = nums.length-1;
        while(start<nums.length-1 && nums[start]==nums[start+1]){
            start++;
        }
        
        while(end>0 && nums[end]==nums[end-1]){
            end--;
        }
        
        return end-start-1;
        
    }
}