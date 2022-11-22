class Solution {
    
    public boolean isTrue(HashMap<Character , Integer> hash1 , HashMap<Character , Integer> hash2){
            for(char ch : hash1.keySet()){
            if(hash2.containsKey(ch)){
                if(hash1.get(ch)==hash2.get(ch)){
                        continue;
                    }
                else if(hash1.get(ch)<hash2.get(ch) || hash1.get(ch)>hash2.get(ch)){
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        
        // This solution is made using the hashmap and sliding window approach...
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()) return ans;
        
        // creating hashmap 1 
        HashMap<Character, Integer> hash1 = new HashMap<>();
        for(int i=0 ; i<p.length() ; i++){
            hash1.put(p.charAt(i) , hash1.getOrDefault(p.charAt(i) , 0)+1);
        }
        
        // creating hashmap 2
        HashMap<Character , Integer> hash2 = new HashMap<>();
        for(int i=0 ; i<p.length() ; i++){
            hash2.put(s.charAt(i) , hash2.getOrDefault(s.charAt(i) ,0)+1);
        }
        
        // Checking for index 0..
        if(hash1.size()==hash2.size()){
            boolean flag = true;
            flag = isTrue(hash1 , hash2);
            if(flag==true) ans.add(0);
        }
        
        
        int index = 0;
        for(int i=p.length() ; i<s.length(); i++){
            if(hash2.get(s.charAt(index))>1){
                hash2.put(s.charAt(index) , hash2.get(s.charAt(index))-1);
            }
            else if(hash2.get(s.charAt(index))==1){
                hash2.remove(s.charAt(index));
            }
            index++;
            hash2.put(s.charAt(i) , hash2.getOrDefault(s.charAt(i) , 0)+1);
            
            
            if(hash1.size()==hash2.size()){
                boolean flag = true;
                flag = isTrue(hash1 , hash2);
                if(flag==true) ans.add(i-p.length()+1);   
            }
            
        }
        
        return ans;
    }
}