class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        
        
        HashMap<String , Integer> hash = new HashMap<>();
        for(int i=0 ; i<senders.length ; i++){
            int n = messages[i].split(" ").length;
            hash.put(senders[i] , hash.getOrDefault(senders[i] , 0)+n);
        }
        
        // for(String str : hash.keySet()){
        //     System.out.println(str + " "+ hash.get(str));
        // }
        
        
        
        TreeMap<Integer , ArrayList<String>> tree = new TreeMap<>(Collections.reverseOrder());
        
        for(String str : hash.keySet()){
            int val = hash.get(str);
            
            ArrayList<String> arr = tree.get(val);
            if(arr==null){
                arr = new ArrayList<>();
                arr.add(str);
                tree.put(val , arr);
            }
            else{
                arr.add(str);
            }
        }
        
        String ans = "";
        for(int i : tree.keySet()){
            ans = tree.get(i).get(0);
            for(int j=1 ; j<tree.get(i).size() ; j++){
                if(tree.get(i).get(j).compareTo(ans)>0){
                    ans = tree.get(i).get(j);
                }
            }
            break;
        }
        return ans;
    }
}