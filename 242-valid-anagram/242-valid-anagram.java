class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        
        HashMap<Character , Integer> hash1 = new HashMap<>();
        HashMap<Character , Integer> hash2 = new HashMap<>();
        
        for(int i=0 ; i<s.length() ; i++){
            hash1.put(s.charAt(i) , hash1.getOrDefault(s.charAt(i) , 0)+1);
        }
        
        for(int i=0 ; i<t.length() ; i++){
            hash2.put(t.charAt(i) , hash2.getOrDefault(t.charAt(i) , 0)+1);
        }
        
        for(char ch : hash1.keySet()){
            if(hash2.get(ch)==null || hash2.get(ch)<hash1.get(ch)){
                return false;
            }
        }
        
        for(char ch : hash2.keySet()){
            if(hash1.get(ch)==null || hash1.get(ch)<hash2.get(ch)){
                return false;
            }
        }
        
        return true;
    }
}