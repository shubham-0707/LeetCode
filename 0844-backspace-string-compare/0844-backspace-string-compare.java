class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='#' && !st1.isEmpty()){
                st1.pop();
            }
            else if(s.charAt(i)=='#' && st1.isEmpty()){
                continue;
            }
            else{
                st1.push(s.charAt(i));
            }
        }
        
        StringBuilder str1 = new StringBuilder();
        while(!st1.isEmpty()){
            str1.append(st1.pop());
        }
        
        Stack<Character> st2 = new Stack<>();
        for(int i=0 ; i<t.length() ; i++){
            if(t.charAt(i)=='#' && !st2.isEmpty()){
                st2.pop();
            }
            else if(t.charAt(i)=='#' && st2.isEmpty()){
                continue;
            }
            else{
                st2.push(t.charAt(i));
            }
        }
        
        StringBuilder str2 = new StringBuilder();
        while(!st2.isEmpty()){
            str2.append(st2.pop());
        }
        
        if(str1.toString().equals(str2.toString())) return true;
        
        return false;
        
    }
}