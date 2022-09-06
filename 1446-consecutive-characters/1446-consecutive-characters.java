class Solution {
    public int maxPower(String s) {
        
        int maxi = 1;
        int count = 1;
        for(int i=1 ; i<s.length() ; i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                maxi = Math.max(maxi , count);
                count=1;
            }
            else{
                count++;
            }
        }
        
        return Math.max(maxi , count);
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}