class Solution {

    
    public String longestPalindrome(String s) {
        
        if(s.length()<=1){
            return s;
        }
        
        int n = s.length();
        int start = 0;
        int end = 0;
        int max_len = 1;
        
        // for odd length string..
        for(int i=0 ; i<n-1 ; i++){
            int l = i;
            int r = i;
            
            while(l>=0 && r<n){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else break;
            }
            
            int len = r-l-1;
            if(len>max_len){
                max_len = len;
                start = l+1;
                end = r-1;
            }
        }
        
        
        
        // for even length string...
        for(int i=0 ; i<n-1 ; i++){
            int l = i;
            int r = i+1;
            
            while(l>=0 && r<n){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else break;
            }
            
            int len = r-l-1;
            
            if(len>max_len){
                max_len = len;
                start = l+1;
                end = r-1;
            }
        }
        
        // returning answer....
        return s.substring(start , end+1);
        
    }
}