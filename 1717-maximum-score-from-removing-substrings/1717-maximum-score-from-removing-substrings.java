class Solution {
    
//     public boolean isAB_BA(String s){
        
//         for(int i=0 ; i<s.length()-1 ; i++){
//             if((s.charAt(i)=='a' && s.charAt(i+1)=='b') || (s.charAt(i)=='b' && s.charAt(i+1)=='a')){
//                 return true;
//             }
//         }
        
//         return false;
//     }
    
    
    public String removeAB(String str , int x){
        Stack<Character> st = new Stack<>();
        
        for(int i=0 ; i<str.length() ; i++){
            if(!st.isEmpty() && (st.peek()=='a' && str.charAt(i)=='b')){
                st.pop();
                sum+=x;
            }
            else{
                st.push(str.charAt(i));
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
    
    public String removeBA(String str , int y){
        Stack<Character> st = new Stack<>();
        
        
        for(int i=0 ; i<str.length() ; i++){
            if(!st.isEmpty() && (st.peek()=='b' && str.charAt(i)=='a')){
                st.pop();
                sum+=y;
            }
            else{
                st.push(str.charAt(i));
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        
        ans.reverse();
        return ans.toString();
    }
    
int sum = 0;
    
public int maximumGain(String s, int x, int y) {
        
        //boolean flag = isAB_BA(s);
        
        // while(flag){
            if(x>y){
                s = removeAB(s , x);
                s = removeBA(s , y);
            }
            else{
                s = removeBA(s , y);
                s = removeAB(s , x);
            }
            
        //     flag = isAB_BA(s);
        // }
        
    
    return sum;
    
    }
}