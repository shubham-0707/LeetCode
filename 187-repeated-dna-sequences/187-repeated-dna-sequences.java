class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        if(s.length()<10) return ans;
        
        HashMap<String , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<=s.length()-10 ; i++){
            String str = s.substring(i , i+10);
            hash.put(str , hash.getOrDefault(str , 0)+1);
        }
        
        for(String str : hash.keySet()){
            if(hash.get(str)>1){
                ans.add(str);
            }
        }
        
        return ans;
    }
}