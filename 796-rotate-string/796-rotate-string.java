class Solution {
    public boolean rotateString(String s, String goal) {
        
        int count = 0;
        while(count<s.length()){
            
            char[] ch = s.toCharArray();
            char chr = ch[0];
            for(int i=0 ; i<ch.length-1 ; i++){
                ch[i] = ch[i+1];
            }
            ch[ch.length-1] = chr;
            
            if(String.valueOf(ch).equals(goal)) return true;
            
            s=String.valueOf(ch);
            count++;
        }
       return false;
    }
}