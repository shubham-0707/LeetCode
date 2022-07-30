class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        
        HashMap<Character , Integer> hash1 = new HashMap<>();
       
        
        for(int i=0 ; i<words2.length ; i++){
             HashMap<Character , Integer> hash2 = new HashMap<>();
            for(int j=0 ; j<words2[i].length() ; j++){
                hash2.put(words2[i].charAt(j) , hash2.getOrDefault(words2[i].charAt(j) , 0)+1);
            }
            
            // Putting maximum value in hash1...
            
            for(char ch : hash2.keySet()){
                hash1.put(ch , Math.max(hash1.getOrDefault(ch , 0) , hash2.get(ch)));
            }
        }
        
        
        List<String> ans = new ArrayList<>();
        
        for(int i=0 ; i<words1.length ; i++){
            HashMap<Character , Integer> hash3 = new HashMap<>();
            for(int j=0 ; j<words1[i].length() ; j++){
                hash3.put(words1[i].charAt(j) , hash3.getOrDefault(words1[i].charAt(j) , 0)+1);
            }
            
            boolean flag = true;
            for(char ch : hash1.keySet()){
                if(!hash3.containsKey(ch) || hash3.get(ch)<hash1.get(ch)){
                    flag = false;
                    break;
                } 
            }
            
            if(flag==true){
                ans.add(words1[i]);
            }
        }
        return ans;
    }
}