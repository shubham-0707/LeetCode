class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<words.length ; i++){
            hash.put(words[i] , hash.getOrDefault(words[i] , 0)+1);
        }
        
        TreeMap<Integer , ArrayList<String>> tree = new TreeMap<>(Collections.reverseOrder());
        for(String str : hash.keySet()){
            int key = hash.get(str);
            
            ArrayList<String> temp = tree.get(key);
            
            if(temp == null){
                temp = new ArrayList<>();
                temp.add(str);
                Collections.sort(temp);
                tree.put(key , temp);
            }
            else{
                temp.add(str);
                Collections.sort(temp);
            }
        }
        
        int count = 0;
        List<String> ans = new ArrayList<String>();
        for(int i : tree.keySet()){
            ArrayList<String> arr = tree.get(i);
            boolean flag = false;
            for(int j=0 ; j<arr.size() ; j++){
                ans.add(arr.get(j));
                if(ans.size()==k){
                    flag = true;
                    break;
                }
            }
            if(flag == true)break;
        }
        
        //Collections.sort(ans);
        return ans;
    }
}