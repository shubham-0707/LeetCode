class Solution {
    public int evalRPN(String[] tokens) {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("+" , 1);
        hash.put("-" , 2);
        hash.put("*" , 3);
        hash.put("/" , 4);
        Stack<Integer> st = new Stack<>();
        
        for(int i=0 ; i<tokens.length ; i++){
            if(hash.get(tokens[i])==null){
                st.push(Integer.valueOf(tokens[i]));
            }
            else{
                int a  = st.pop();
                int b = st.pop();
                if(hash.get(tokens[i])==1) st.push(a+b);
                else if(hash.get(tokens[i])==2) st.push(b-a);
                else if(hash.get(tokens[i])==3) st.push(a*b);
                else st.push((int)b/a);
               // System.out.print(result+" ");
                //st.push(result);
            }
        }
        
        return st.pop();
    }
}