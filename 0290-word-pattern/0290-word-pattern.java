class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        
        HashMap<Character , String> hash = new HashMap<>();
        
        for(int i=0 ; i<pattern.length() ; i++){
            if(hash.containsKey(pattern.charAt(i)) && hash.get(pattern.charAt(i)).equals(arr[i])==false){
                return false;
            }
            else{
                hash.put(pattern.charAt(i) , arr[i]);
            }
        }
        
        HashMap<String , Character> hash2 = new HashMap<>();
        
        for(int i=0 ; i<arr.length ; i++){
            if(hash2.containsKey(arr[i]) && hash2.get(arr[i])!=pattern.charAt(i)){
                return false;
            }
            else{
                hash2.put(arr[i] , pattern.charAt(i));
            }
        }
        
        return true;
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}