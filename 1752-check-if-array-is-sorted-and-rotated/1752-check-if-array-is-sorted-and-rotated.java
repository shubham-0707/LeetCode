class Solution {
    public boolean check(int[] nums) {
        
        
        String ans = "";
        for(int i=0 ; i<nums.length-1 ; i++){
            ans = ans + nums[i]+"_";
        }
        ans = ans+nums[nums.length-1];
        Arrays.sort(nums);
        int x = 0;
        
        while(x<nums.length){
            
            int temp = nums[0];
            for(int i=0 ; i<nums.length-1 ; i++){
                nums[i] = nums[i+1];
            }
            nums[nums.length-1] = temp;
            
            String ans2 = "";
            for(int i=0 ; i<nums.length-1 ; i++){
                ans2 = ans2+nums[i]+"_";
            }
            ans2+=nums[nums.length-1];
            
            if(ans.equals(ans2)) return true;
            x++;
        }
        
        
        return false;
    }
}