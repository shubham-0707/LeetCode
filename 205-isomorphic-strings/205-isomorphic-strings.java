class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character , Character> hash = new HashMap<>();
        
        if(s.length()!=t.length()) return false;
        
        for(int i=0 ; i<s.length() ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(!hash.containsKey(c1)){
                if(hash.containsValue(c2)){
                    return false;
                }
            }
            else if(hash.get(c1)!=c2){
                return false;
            }
            hash.put(c1 , c2);
        }
        
        return true;
        
    }
}