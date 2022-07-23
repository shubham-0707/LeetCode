class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String ans = "";
        int idx1 = 0;
        int idx2 = 0;
        int evod = 0;
        while(idx1<word1.length() && idx2<word2.length()){
            if(evod%2==0){
                ans+=word1.charAt(idx1++);
            }
            else{
                ans+=word2.charAt(idx2++);
            }
            evod++;
        }
        
        while(idx1<word1.length()){
            ans+=word1.charAt(idx1++);
        }
        while(idx2<word2.length()){
            ans+=word2.charAt(idx2++);
        }
        return ans;
    }
}