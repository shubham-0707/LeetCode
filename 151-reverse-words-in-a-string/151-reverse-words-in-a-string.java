class Solution {
    public String reverseWords(String s) {
        
        String[] strs = s.split(" ");
        
        String ans = "";
        for(int i=strs.length-1 ; i>=0 ; i--){
            if(strs[i].length()>0){
                ans+=strs[i]+" ";
            }
        }
        
        ans = ans.trim();
        
        return ans;
        
    }
}