class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        
        HashMap<Character , Character> hash1 = new HashMap<>();
        HashMap<Character , Character> hash2 = new HashMap<>();
        
        for(int i=0 ; i<s.length() ; i++){
            if(!hash1.containsKey(s.charAt(i)) && !hash2.containsKey(t.charAt(i))){
                hash1.put(s.charAt(i) , t.charAt(i));
                hash2.put(t.charAt(i) , s.charAt(i));
            }
            else if(hash1.containsKey(s.charAt(i)) && hash1.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            else if(hash2.containsKey(t.charAt(i)) && hash2.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}