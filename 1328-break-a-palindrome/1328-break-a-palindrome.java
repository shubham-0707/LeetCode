class Solution {
    
    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)) return false;
            start++;
            end--;
        }
        
        return true;
    }
    
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==0 || palindrome.length()==1) return "";
        
        char[] ch = palindrome.toCharArray();
        
        for(int i=0 ; i<ch.length ; i++){
            if(ch[i]!='a'){
                 char temp = ch[i];
                ch[i] = 'a';
                if(isPalindrome(new String(ch))==false) return new String(ch);
                else ch[i] = temp;
            }
        }
        
        ch[ch.length-1] = 'b';
        
        return new String(ch);
    }
}