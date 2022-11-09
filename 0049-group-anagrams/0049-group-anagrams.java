class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        
        HashMap<String , ArrayList<String>> hash = new HashMap<>();
        for(int i=0 ; i<strs.length ; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            ArrayList<String> tempi = hash.get(temp);
            if(tempi==null){
                tempi = new ArrayList<>();
                tempi.add(strs[i]);
                hash.put(temp , tempi);
            }
            else{
                tempi.add(strs[i]);
            }
        }
        
        for(String str : hash.keySet()){
            List<String> temp = hash.get(str);
            ans.add(temp);
        }
        return ans;
    }
}