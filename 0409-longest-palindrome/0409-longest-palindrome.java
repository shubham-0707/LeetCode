class Solution {
    public int longestPalindrome(String s) {
        
        int count = 0;
        
        HashMap<Character , Integer> hash = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            hash.put(s.charAt(i) , hash.getOrDefault(s.charAt(i) , 0)+1);
        }
        
        
        for(char ch : hash.keySet()){
            count+=hash.get(ch)/2;
            hash.put(ch , hash.get(ch)%2);
        }
        
        count*=2;
        for(char ch : hash.keySet()){
            if(hash.get(ch)==1){
                count+=1;
                break;
            }
        }
        
        return count;
        
    }
}