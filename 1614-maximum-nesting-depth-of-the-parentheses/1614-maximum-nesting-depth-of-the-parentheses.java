class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxi = 0;
        Stack<Character> st = new Stack<>();
        
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('){
                st.push('(');
                count++;
                maxi = Math.max(maxi , count);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return maxi;
    }
}