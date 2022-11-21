class Pair{
    char ch;
    int idx;
    
    Pair(char ch , int idx){
        this.ch = ch;
        this.idx = idx;
    }
    
}

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Pair> st = new Stack<>();
        
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==')' || s.charAt(i)=='('){
                //System.out.println("1");
                if(st.isEmpty()){
                    st.push(new Pair(s.charAt(i) , i));
                }
                
                else{
                    if(s.charAt(i)=='('){
                        st.push(new Pair(s.charAt(i) , i));
                    }
                    else if(s.charAt(i)==')' && st.peek().ch=='('){
                        st.pop();
                    }
                    else if(s.charAt(i)==')' && st.peek().ch==')'){
                        st.push(new Pair(s.charAt(i) , i));
                    }
                }
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        HashMap<Integer , Boolean> hash = new HashMap<>();
        
        while(!st.isEmpty()){
            hash.put(st.pop().idx , true);
        }
        
        for(int i=0 ; i<s.length() ; i++){
            if(!hash.containsKey(i)){
                ans.append(s.charAt(i));
            }
        }
        
        
        return ans.toString();
    }
}