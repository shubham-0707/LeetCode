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
                int curr = Math.abs(asteroids[i]);
                boolean flag = true;
                
                while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0){
                    
                    int a = Math.abs(st.peek());
                    
                    if(a>curr){
                        flag = false;
                        break;
                    }
                    else if(a==curr){
                        st.pop();
                        flag = false;
                        break;
                    }
                    else if(a<curr){
                        flag = true;
                        st.pop();
                    }
                }
                
                if(flag==true){
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