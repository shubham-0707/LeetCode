class Solution {
    
    public static void reverseArray(int[] arr){
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
    
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0 ; i<asteroids.length ; i++){
            if(st.isEmpty()){
                st.push(asteroids[i]);
            }
            else{
                int c = Math.abs(asteroids[i]);
                boolean flag = true;
                
                while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0){
                
                int a = st.peek();
                int b = Math.abs(a);
                if(b>c){
                    flag = false;
                    break;
                }    
                if(c>b){
                    st.pop();
                }
                else if(b==c){
                    flag = false;
                    st.pop();
                    break;
                }
                    
                }
                
                if(flag == true){
                    st.push(asteroids[i]);
                }
               
            }
            
            
        }
        int[] ans = new int[st.size()];
        int x = 0;
        while(!st.isEmpty()){
            ans[x++] = st.pop();
        }
        reverseArray(ans);
        return ans;
    }
}