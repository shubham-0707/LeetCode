class Solution {
    public List<Integer> partitionLabels(String s) {
        
        
        
        int[] last_index = new int[26];
        
        for(int i=0 ; i<s.length() ; i++){
            last_index[s.charAt(i)-'a'] = i;
        }
        
        int boundary = 0;
        int count = 0;
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<s.length() ; i++){
            boundary = Math.max(boundary , last_index[s.charAt(i)-'a']);
            count++;
            if(boundary==i){
                ans.add(count);
                count=0;
            }
        }
        
        return ans;
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
        
    }
}