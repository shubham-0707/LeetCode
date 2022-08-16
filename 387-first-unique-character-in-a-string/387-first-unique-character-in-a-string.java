class Solution {
    public int firstUniqChar(String s) {
        
        // Approach is to make 2 hashmaps , one for frequency and one for the index of the character...
        LinkedHashMap<Character  , Integer> hash = new LinkedHashMap<>();
        LinkedHashMap<Character , Integer> hash2 = new LinkedHashMap<>();
        
        // inserting charcter and frequency in hash and inserting character and index in hash2...
        for(int i=0 ; i<s.length() ; i++){
            hash.put(s.charAt(i) , hash.getOrDefault(s.charAt(i) , 0)+1);
            hash2.put(s.charAt(i) , i);
        }
        
        
        // checking which character is first to get frequency equals to 1 and then we are returning its index from hash2..
        for(char ch : hash.keySet()){
            if(hash.get(ch)==1){
                return hash2.get(ch);
            }
        }
        
        // if no desirable character is found then -1 is returned..
        return -1;
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}