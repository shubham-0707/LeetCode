class Solution {
    
    public static int[] prevSmaller(int[] arr){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        
        int[] ans = new int[arr.length];
        
        for(int i=0 ; i<arr.length ; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
                idx.push(i);
                ans[i]=-1;
            }
            else{
                while(!st.isEmpty() && !idx.isEmpty() && st.peek()>arr[i]){
                    st.pop();
                    idx.pop();
                }
                
                if(st.isEmpty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = idx.peek();
                }
                
                st.push(arr[i]);
                idx.push(i);
            }
        }
        
        return ans;
    }
    
    public int sumSubarrayMins(int[] arr) {
        int[] prev = prevSmaller(arr);
        int[] result = new int[arr.length];
        int MOD = (int)Math.pow(10 , 9)+7;
        
        for(int i=0 ; i<arr.length ; i++){
            if(prev[i]<0){
                result[i] =(i-prev[i])*arr[i];
            }
            else{
                result[i] = (result[prev[i]]) + (i-prev[i])*arr[i];
            }
            
        }
        
        int sum = 0;
        for(int i=0 ; i<result.length ; i++){
            sum = (sum%MOD+result[i]%MOD)%MOD;
        }
        
        return sum%MOD;
    }
}