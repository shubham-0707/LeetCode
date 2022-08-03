class Solution {
    public int firstUniqChar(String s) {
        
        LinkedHashMap<Character  , Integer> hash = new LinkedHashMap<>();
        LinkedHashMap<Character , Integer> hash2 = new LinkedHashMap<>();
        
        for(int i=0 ; i<s.length() ; i++){
            hash.put(s.charAt(i) , hash.getOrDefault(s.charAt(i) , 0)+1);
            hash2.put(s.charAt(i) , i);
        }
        
        for(char ch : hash.keySet()){
            if(hash.get(ch)==1){
                return hash2.get(ch);
            }
        }
        
        return -1;
    }
}