class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        
        for(int i=2*nums.length-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                ans.push(-1);
            }
            else{
                while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.push(-1);
                }
                else{
                    ans.push(st.peek());
                }
            }
            st.push(nums[i%nums.length]);
        }
        
        int[] ans_arr = new int[nums.length];
        
        for(int i=0 ; i<ans_arr.length ; i++){
            ans_arr[i] = ans.pop();
        }
        
        return ans_arr;
    }
}