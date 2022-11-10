class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        
        HashMap<String , Integer> hash = new HashMap<>();
        for(int i=0 ; i<=s.length()-10 ; i++){
            String temp = s.substring(i , i+10);
            hash.put(temp, hash.getOrDefault(temp , 0)+1);
        }
        
        for(String str : hash.keySet()){
            if(hash.get(str)>1){
                ans.add(str);
            }
        }
        
        return ans;
    }
}