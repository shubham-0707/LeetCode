class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0 ; i<n-2 ; i++){
            int k = i+2;
            for(int j=i+1 ; j<n-1 && nums[i]!=0 ; j++){
                while(k<nums.length && nums[i]+nums[j]>nums[k]){
                    k++;
                }
                count+=k-j-1;
            }
        }
        return count;
    }
}