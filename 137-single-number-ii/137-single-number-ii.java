class Solution {
    public int singleNumber(int[] nums) {
        
        
        int ans = 0;
        for(int i=0 ; i<32  ; i++){
            
            int mask = 1<<i;
            int count = 0;
            
            for(int n : nums){
                if((n&mask)!=0){
                    count++;
                }
            }
            
            if(count%3!=0){
                ans = ans|mask;
            }
        }
        return ans;
    }
}