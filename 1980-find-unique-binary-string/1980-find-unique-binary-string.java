class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int len = nums[0].length();
        
        double range = Math.pow(2 , len) - 1;
        
        String ans = "";
        for(int i=0 ; i<=range ; i++){
            String str = Integer.toBinaryString(i);
            if(str.length()!=len){
                while(str.length()<len){
                    str="0"+str;
                }
            }
            if(Arrays.asList(nums).contains(str)==false){
                ans = str;
                break;
            }
        }
        
        return ans;
    }
}