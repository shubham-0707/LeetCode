class Solution {
    public String decodeString(String s) {
        
        
        Stack<Character> st = new Stack<>();
        
        for(int i=s.length()-1 ; i>=0 ; i--){
            
            // here factor to which we have to multiply the string is selected...
            if(s.charAt(i)=='['){
                int factor = -1;
                if(i==0){
                    factor = 1;
                }
                else{
                    i--;
                    StringBuilder str = new StringBuilder();
                    while(i>=0 && (int)s.charAt(i)>=48 && (int)s.charAt(i)<=57){
                        str.append(s.charAt(i));
                        i--;
                    }
                    i++;
                    String temp = str.reverse().toString();
                    factor = Integer.parseInt(temp);
                }
                
                // then string is increased the factor times and then again putted back to the stack...
                
                StringBuilder str = new StringBuilder();
                while(st.peek()!=']'){
                    str.append(st.pop());
                }
                st.pop();
                
                String temp = str.toString();
                String ans = "";
                for(int j=0 ; j<factor ; j++){
                    ans+=temp; 
                }
                
                for(int j=ans.length()-1 ; j>=0 ; j--){
                    st.push(ans.charAt(j));
                }
                
            }
            else{
                st.push(s.charAt(i));
            }
        }
        
        
        // here the stack content is converted to the string using string builder to return the answer...
        
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        
        
        return ans.toString();
        
        // Time Complexity : O(N)
        // Space Complexity : O(N) since stack is used to solve this question....
    }
}