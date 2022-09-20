class Solution {
    
    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        
        return true;
    }
    
    public int countSubstrings(String s) {
        int count = 0;
        
        for(int i=0 ; i<s.length() ; i++){
            for(int j=i ; j<s.length() ; j++){
                if(isPalindrome(s.substring(i , j+1)))count++;
            }
        }
        
        return count;
    }
}