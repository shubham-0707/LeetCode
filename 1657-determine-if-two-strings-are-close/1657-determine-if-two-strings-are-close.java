class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        int[] ch1 = new int[26];
        int[] ch2 = new int[26];
        
        for(int i=0 ; i<word1.length() ; i++){
            ch1[word1.charAt(i)-'a']++;
        }
        for(int i=0 ; i<word2.length() ; i++){
            if(ch1[word2.charAt(i)-'a']==0) return false;
            ch2[word2.charAt(i)-'a']++;
        }
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        for(int i=0 ; i<26 ; i++){
            if(ch1[i]!=ch2[i]) return false;
        }
        
        return true;
    }
}