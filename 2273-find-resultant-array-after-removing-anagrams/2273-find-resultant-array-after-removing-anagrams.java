class Solution {
    
    public boolean isAnagram(String key , String temp){
        if(key.length()!=temp.length()){
            return false;
        }
        HashMap<Character , Integer> hash1 = new HashMap<>();
        HashMap<Character , Integer> hash2 = new HashMap<>();
        
        for(int i=0 ; i<key.length() ; i++){
            hash1.put(key.charAt(i) , hash1.getOrDefault(key.charAt(i) , 0)+1);
        }
        
        for(int i=0 ; i<temp.length() ; i++){
            hash2.put(temp.charAt(i) , hash2.getOrDefault(temp.charAt(i) , 0)+1);
        }
        
        for(char ch : hash1.keySet()){
            if(hash1.get(ch)!=hash2.get(ch)){
                return false;
            }
        }
        return true;
    }
    
    
    public List<String> removeAnagrams(String[] words) {
        
        
        List<String> ans = new ArrayList<>();
        
        for(int i=0 ; i<words.length ; i++){
            ans.add(words[i]);
        }
      
        int i=0;
       while(i<ans.size()-1){
           if(isAnagram(ans.get(i) , ans.get(i+1))){
               ans.remove(ans.get(i+1));
           }
           else{
               i++;
           }
       }
       
        return ans;
    }
}