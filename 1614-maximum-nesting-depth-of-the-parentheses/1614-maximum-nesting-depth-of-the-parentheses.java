class Solution {
    public int maxDepth(String s) {
        
        int count = 0;
        int maxi = 0;
        
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('){
               
                count++;
                maxi = Math.max(maxi , count);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return maxi;
    }
}