class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // storing the letters of ransom in a hashmap..
        HashMap<Character , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<ransomNote.length() ; i++){
            hash.put(ransomNote.charAt(i) , hash.getOrDefault(ransomNote.charAt(i) ,0)+1);
        }
        
        // storing the letters of magazine in  a hashmap...
        
        HashMap<Character , Integer> hash2 = new HashMap<>();
        
        for(int i=0  ; i<magazine.length() ; i++){
            hash2.put(magazine.charAt(i) , hash2.getOrDefault(magazine.charAt(i) , 0)+1);
        }
        
        
        // traversing the ransomNote to check that it is possible or not...
        for(char ch : hash.keySet()){
            if(hash2.get(ch)==null || hash2.get(ch)<hash.get(ch)){
                return false;
            }
        }
        
        return true;
    }
}