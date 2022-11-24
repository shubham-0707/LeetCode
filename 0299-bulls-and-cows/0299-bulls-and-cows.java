class Solution {
    public String getHint(String secret, String guess) {
        
        HashMap<Integer , Character> hash1 = new HashMap<>();
        HashMap<Integer , Character> hash2 = new HashMap<>();
        
        
        for(int i=0 ; i<secret.length() ; i++){
            hash1.put(i , secret.charAt(i));
            hash2.put(i , guess.charAt(i));
        }
        
        int countBulls = 0;
        
        for(int i : hash1.keySet()){
            if(hash1.get(i)==hash2.get(i)){
                countBulls++;
                hash1.put(i , '#');
                hash2.put(i, '&');
            }
        }
        
        HashMap<Character , Integer> hash3 = new HashMap<>();
        HashMap<Character , Integer> hash4 = new HashMap<>();
        
        for(char ch : hash1.values()){
            if(ch!='#'){
                hash3.put(ch , hash3.getOrDefault(ch , 0)+1);
            }
            
        }
        
        for(char ch : hash2.values()){
            if(ch!='&'){
                hash4.put(ch , hash4.getOrDefault(ch , 0)+1);
            }
        }
        
        int countCows = 0;
        
        for(char ch : hash3.keySet()){
            if(hash4.containsKey(ch)){
                countCows+=Math.min(hash3.get(ch) , hash4.get(ch));
            }
        }
        
        return countBulls+""+"A"+countCows+""+"B";
    }
}