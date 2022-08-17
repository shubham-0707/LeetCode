class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<s.length() ; i++){
            hash.put(s.charAt(i) , hash.getOrDefault(s.charAt(i) , 0)+1);
        }
        
        TreeMap<Integer , ArrayList<Character>> tree = new TreeMap<>(Collections.reverseOrder());
        
        for(char i:hash.keySet()){
            ArrayList<Character> temp = tree.get(hash.get(i));
            if(temp==null){
                temp = new ArrayList<Character>();
                temp.add(i);
                tree.put(hash.get(i) , temp);
            }
            else{
                temp.add(i);
            }
        }
        
        String ans = "";
        for(int i:tree.keySet()){
            for(int j=0 ; j<tree.get(i).size() ; j++){
                char ch = tree.get(i).get(j);
                for(int k=0 ; k<i ; k++){
                    ans=ans+ch;
                }
            }
        }
        return ans;
    }
}