class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] arr = new int[26];
        
        int longest_count = 0;
        int start = 0;
        int max_len = 0;
        
        for(int end = 0 ; end<s.length() ; end++){
            
            arr[s.charAt(end)-'A']++;
            
            longest_count = Math.max(longest_count , arr[s.charAt(end)-'A']);
            
            if(end-start+1-longest_count>k){
                arr[s.charAt(start)-'A']--;
                start++;
            }
            
            max_len = Math.max(max_len , end-start+1);
        }
        
        return max_len;
    }
}