class Solution {
    public static ArrayList<Integer> prevSmallerIndex(int[] arr){
        
        
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        for(int i=0 ; i<arr.length ; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
                idx.push(i);
                ans.add(-1);
            }
            else{
                while(!st.isEmpty() && !idx.isEmpty() && st.peek()>=arr[i]){
                    st.pop();
                    idx.pop();
                }
                if(st.isEmpty() && idx.isEmpty()){
                    ans.add(-1);
                }
                else{
                    ans.add(idx.peek());
                }
                st.push(arr[i]);
                idx.push(i);
            }
        }
        
        
        
        return ans;
    }
    
    
    public static ArrayList<Integer> nextSmallerIndex(int[] arr){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=arr.length-1 ; i>=0 ; i--){
            if(st.isEmpty()){
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
        
        return ans;
    }
    
    
    public int maxHistogram(int[] arr){
        int maxi = 0;
        
        ArrayList<Integer> prevSmall = prevSmallerIndex(arr);
        ArrayList<Integer> nextSmall = nextSmallerIndex(arr);
        
        for(int i=0 ; i<arr.length ; i++){
            int area = (nextSmall.get(i)-prevSmall.get(i)-1)*arr[i];
            maxi = Math.max(maxi , area);
        }
        
        return maxi;
    }
    
    
    public int maximalRectangle(char[][] matrix) {
        char[] temp = matrix[0];
        int[] arr = new int[temp.length];
        for(int i=0 ; i<arr.length ; i++){
            if(temp[i]=='1'){
                arr[i]=1;
            }
            else if(temp[i]=='0'){
                arr[i]=0;
            }
        }
        
        int maxArea = maxHistogram(arr);
        
        for(int i=1 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]=='1'){
                    arr[j]+=1;
                }
                else if(matrix[i][j]=='0'){
                    arr[j]=0;
                }
            }
            int currArea = maxHistogram(arr);
            maxArea = Math.max(maxArea , currArea); 
        }
        
        return maxArea;
    }
}