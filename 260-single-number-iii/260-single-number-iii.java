class Solution {
    public int[] singleNumber(int[] nums) {
        
        
        int xor = 0;
        for(int i=0 ; i<nums.length ; i++){
            xor = xor^nums[i];
        }
        
        int count = 0;
        while(xor!=0){
            if((xor&1)>0){
                break;
            }
            count++;
            xor = xor>>1;
        }
        
        int xor1 = 0;
        int xor2 = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            if((nums[i]&(1<<count))>0){
                xor1=xor1^nums[i];
            }
            else{
                xor2=xor2^nums[i];
            }
        }
        
        int[] ans = new int[2];
        ans[0] = xor1;
        ans[1] = xor2;
        
        return ans;
        
    }
}