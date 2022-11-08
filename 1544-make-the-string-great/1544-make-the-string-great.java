class Solution {
    public String makeGood(String s) {
        
        // Previously I did this question using the iterative approach but this time I am using the Stack approach and this approach is very efficient...
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0 ; i<s.length() ; i++){
            boolean flag = false;
            if(!st.isEmpty() && ((int)st.peek()-32 == (int)s.charAt(i) || (int)st.peek() == (int)s.charAt(i)-32)){
                st.pop();
                flag = true;
            }
            
            if(!flag){
                st.push(s.charAt(i));
            }
        }
        
        String ans = "";
        
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        
        return ans;
    }
}