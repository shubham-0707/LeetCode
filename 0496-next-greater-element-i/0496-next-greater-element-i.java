class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        
        for(int i=nums2.length-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                ans.push(-1);
            }
            else{
                while(!st.isEmpty() && st.peek()<=nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.push(-1);
                }
                else{
                    ans.push(st.peek());
                }
            }
            st.push(nums2[i]);
        }
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        int x = 0;
        while(!ans.isEmpty()){
            hash.put(nums2[x++] , ans.pop());
        }
        
        int[] ans_arr = new int[nums1.length];
        
        for(int i=0 ; i<nums1.length ; i++){
            ans_arr[i] = hash.get(nums1[i]);
        }
        
        return ans_arr;
    }
}