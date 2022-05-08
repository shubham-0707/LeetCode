class Solution {
    public int countPrefixes(String[] words, String s) {
        
        int count = 0;
        
        for(int i=0 ; i<words.length ; i++){
            if(words[i].length()<=s.length()){
            String substr = s.substring(0 , words[i].length());
            if(substr.equals(words[i])){
                count++;
            }
        }
    }
        
        return count;
    }
}