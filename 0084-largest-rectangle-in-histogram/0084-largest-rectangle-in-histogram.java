class Solution {
    
    public int[] prevSmallIndex(int[] arr){
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> idx = new Stack<>();
        int[] ans = new int[arr.length];
        int j=0;
        
        for(int i=0 ; i<arr.length ; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
                idx.push(i);
                ans[j++] = -1;
            }
            else{
                while(!st.isEmpty() && !idx.isEmpty() && st.peek()>=arr[i]){
                    st.pop();
                    idx.pop();
                }
                
                if(st.isEmpty() && idx.isEmpty()){
                    ans[j++] = -1;
                }
                else{
                    ans[j++] = idx.peek();
                }
                
                st.push(arr[i]);
                idx.push(i);
            }
        }
        return ans;
    }
    
    public static int[] nextSmallIndex(int[] arr){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        for(int i=arr.length-1 ; i>=0 ;i--){
            if(st.isEmpty() && idx.isEmpty()){
                st.push(arr[i]);
                idx.push(i);
                ans.add(arr.length);
            }
            else{
                while(!st.isEmpty() && !idx.isEmpty() && st.peek()>=arr[i]){
                    st.pop();
                    idx.pop();
                }
                if(st.isEmpty() && idx.isEmpty()){
                    ans.add(arr.length);
                }
                else{
                    ans.add(idx.peek());
                }
                st.push(arr[i]);
                idx.push(i);
            }
        }
        Collections.reverse(ans);
        int[] temp = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            temp[i] = ans.get(i);
        }
        
        return temp;
    }
    
    public int largestRectangleArea(int[] heights) {
        int maxi = 0;
        
        int[] prev = prevSmallIndex(heights);
        int[] next = nextSmallIndex(heights);
        
        for(int i=0 ;i<heights.length ; i++){
            int area = (next[i]-prev[i]-1)*heights[i];
            
            maxi = Math.max(maxi , area);
        }
        
        return maxi;
    }
}