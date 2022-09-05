class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String , ArrayList<String>> hash = new HashMap<>();
        
        for(int i=0 ; i<strs.length ; i++){
            String temp = strs[i];
            
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            temp = new String(ch);
            
            ArrayList<String> temp_ans = hash.get(temp);
            
            if(temp_ans==null){
                temp_ans = new ArrayList<String>();
                temp_ans.add(strs[i]);
                hash.put(temp , temp_ans);
            }
            else{
                temp_ans.add(strs[i]);
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        for(String str : hash.keySet()){
            ans.add(hash.get(str));
        }
        
        return ans;
    }
}