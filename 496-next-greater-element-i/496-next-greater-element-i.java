class Solution {
    
    public static int linearSearch(int[] arr , int key){
        int idx = -1;
        for(int i=0 ;i<arr.length ; i++){
            if(arr[i]==key){
                idx = i;
                break;
            }
        }
        return idx;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=nums2.length-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                st.push(nums2[i]);
                hash.put(i , -1);
            }
            else{
                while(!st.isEmpty() && st.peek()<=nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    hash.put(i , -1);
                }
                else{
                    hash.put(i , st.peek());
                }
                st.push(nums2[i]);
            }
        }
        int j=0;
        int[] ans = new int[nums1.length];
        for(int i=0 ; i<nums1.length ; i++){
            int idx = linearSearch(nums2 ,nums1[i]);
            ans[j++] = hash.get(idx);
        }
        
        return ans;
    }
}