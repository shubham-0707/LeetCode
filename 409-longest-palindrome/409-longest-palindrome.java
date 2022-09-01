class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<s.length() ; i++){
            hash.put(s.charAt(i) , hash.getOrDefault(s.charAt(i) , 0)+1);
        }
        
        int maxi = 0;
        
        for(char ch : hash.keySet()){
            
            maxi = maxi + hash.get(ch)/2;
            hash.put(ch , hash.get(ch)%2);
        }
        maxi=maxi*2;
        
        for(char ch : hash.keySet()){
            if(hash.get(ch)==1){
                maxi+=1;
                break;
            }
        }
        
        return maxi;
    }
}