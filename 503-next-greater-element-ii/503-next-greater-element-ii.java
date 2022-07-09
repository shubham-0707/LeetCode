class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        int n = arr.length;
        
        for(int i=2*n-1 ; i>=0 ;i--){
            if(st.isEmpty()){
                st.push(arr[i%n]);
                ans.push(-1);
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i%n]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.push(-1);
                }
                else{
                    ans.push(st.peek());
                }
                st.push(arr[i%n]);
            }
        }
        
        int[] _ans = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            _ans[i] = ans.pop();
        }
        
        return _ans;
    }
}