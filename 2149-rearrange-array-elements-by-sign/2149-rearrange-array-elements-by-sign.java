class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        
        int[] ans = new int[nums.length];
        
        int pos_idx=0;
        int neg_idx = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]>0){
                pos[pos_idx++] = nums[i];
            }
            else if(nums[i]<0){
                neg[neg_idx++] = nums[i];
            }
        }
        
        pos_idx=0;
        neg_idx=0;
        for(int i=0 ; i<nums.length ; i++){
            if(i%2==0) ans[i]=pos[pos_idx++];
            else ans[i] = neg[neg_idx++];
        }
        
        return ans;
    }
}