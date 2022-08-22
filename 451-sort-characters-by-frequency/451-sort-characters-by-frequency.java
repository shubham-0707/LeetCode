class Solution {
    public String frequencySort(String s) {
        
        // first we are going to use a hashmap to store the frequency of each element...
        
        HashMap<Character , Integer> hash = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            hash.put(s.charAt(i) , hash.getOrDefault(s.charAt(i) , 0)+1);
        }
        
        // Now I am going to store the characters based on their frequency in an arraylist of character in a treemap sorted in descending order...
        
        TreeMap<Integer , ArrayList<Character>> tree = new TreeMap<>(Collections.reverseOrder());
        for(char ch : hash.keySet()){
            ArrayList<Character> temp = tree.get(hash.get(ch));
            
            if(temp==null){
                temp = new ArrayList<>();
                temp.add(ch);
                tree.put(hash.get(ch) , temp);
            }
            else{
                temp.add(ch);
            }
        }
        
        // now getting the answer...
        String ans = "";
        for(int i:tree.keySet()){
            for(int j=0 ; j<tree.get(i).size() ; j++){
                for(int k = 0; k<i ; k++){
                    ans+=tree.get(i).get(j);
                }
            }
        }
        
        return ans;
        
    }
}