class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        
        // Firstly I have found the minimum sized string because the answer cannot exceed the length of a minimum length string in strs...
        int mini = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i=0 ; i<strs.length ; i++){
            if(strs[i].length()<mini){
                mini = strs[i].length();
                minIndex = i;
            }
        }
        
        // Then I have checked for every character of the test string in the given string array...
        String test = strs[minIndex];
        String ans = "";
        for(int i=0 ; i<test.length() ; i++){
            for(int j=0 ; j<strs.length ; j++){
                if(test.charAt(i)!=strs[j].charAt(i)){
                    return ans;
                }
            }
            ans+=test.charAt(i);
        }
        return ans;
        
        // Time Complexity : O(N^2)
        // Space Complexity : O(1)
    }
}