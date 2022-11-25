class Solution {
    
    
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        
    }
    
    public static int[] prevSmaller(int[] arr){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        
        for(int i=0 ; i<arr.length ; i++){
            if(st.isEmpty()){
                ans.push(-1);
            }
            else{
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.push(-1);
                }
                else{
                    ans.push(st.peek());
                }
            }
            st.push(i);
        }
        
        int[] ans_arr = new int[arr.length];
        for(int i=0 ; i<ans_arr.length ; i++){
            ans_arr[i] = ans.pop();
        }
        reverse(ans_arr);
        
        return ans_arr;
    }
    
    public int sumSubarrayMins(int[] arr) {
        
        int[] prev = prevSmaller(arr);
        int[] result = new int[arr.length];
        
        for(int i=0 ; i<arr.length ; i++){
            if(prev[i]<0){
                result[i] = (i-prev[i])*arr[i];
            }
            else{
                result[i] = result[prev[i]] + (i-prev[i])*arr[i];
            }
        }
        
        int sum = 0;
        int mod = 1000000007;
        
        for(int i=0 ; i<result.length ; i++){
            sum = (sum%mod + result[i]%mod)%mod;
        }
        return sum%mod;
    }
}