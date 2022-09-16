class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        String ans = "";
        for(int i=0 ; i<s.length() ; i++){
            if(((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122) || ((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)){
                ans=ans+s.charAt(i);
            }
        }
       
        
        int start = 0;
        int end = ans.length()-1;
        
        while(start<end){
            if(ans.charAt(start)!=ans.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}