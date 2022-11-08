class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] string = s.split(" ");
        
        
        if(string.length!=pattern.length()) return false;
        
        HashMap<Character , String> hash = new HashMap<>();
        
        for(int i=0 ; i<pattern.length() ; i++){
            if(hash.containsKey(pattern.charAt(i)) && hash.get(pattern.charAt(i)).equals(string[i])==false){
                return false;
            }
            else{
                hash.put(pattern.charAt(i) , string[i]);
            }
        }
        
        HashMap<String , Character> hash2 = new HashMap<>();
        
        for(int i=0 ; i<string.length ; i++){
            if(hash2.containsKey(string[i]) && hash2.get(string[i]).equals(pattern.charAt(i))==false){
                return false;
            }
            else{
                hash2.put(string[i] , pattern.charAt(i));
            }
        }
        
        return true;
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
        
    }
}