class Solution {
    public int partitionString(String s) {
        int count = 0;
        
        int i = 0;
        
        while(i<s.length()){
            HashMap<Character , Integer> hash = new HashMap<>();
            while(i<s.length() && !hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i) , hash.getOrDefault(s.charAt(i) , 0)+1);
                i++;
                //System.out.print(i+" ");
            }
            count++;
        }
        
        return count;
    }
}