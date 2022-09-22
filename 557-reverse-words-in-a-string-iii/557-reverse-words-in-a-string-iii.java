class Solution {
    
    public static String reverse(String str){
        
        char[] chr = str.toCharArray();
        
        int start = 0;
        int end = chr.length-1;
        
        while(start<end){
            char temp = chr[start];
            chr[start] = chr[end];
            chr[end] = temp;
            start++;
            end--;
        }
        
        return new String(chr);
    }
    
    
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        
        String ans = "";
        
        for(int i=0 ; i<strs.length-1 ; i++){
            ans = ans + reverse(strs[i]) + " ";
        }
        ans = ans + reverse(strs[strs.length-1]);
        
        return ans;
    }
}