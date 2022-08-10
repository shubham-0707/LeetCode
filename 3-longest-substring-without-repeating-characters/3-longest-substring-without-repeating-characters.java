class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int maxi = 0;
        
        for(int i=0 ; i<s.length() ; i++){
            HashMap<Character , Integer> hash = new HashMap<>();
            for(int j=i ; j<s.length() ; j++){
                if(!hash.containsKey(s.charAt(j))){
                    hash.put(s.charAt(j) , 1);
                }
                else{
                    break;
                }
            }
            maxi = Math.max(maxi , hash.size());
        }   
        return maxi;
    }
}