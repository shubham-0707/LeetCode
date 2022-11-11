class Solution {
    public boolean isSubsequence(String s, String t) {
        
        
        int x = -1;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            x++;
            while(x<t.length() && t.charAt(x)!=ch){
                x++;
            }
            if(x==t.length()) return false;
        }
        return true;
    }
}