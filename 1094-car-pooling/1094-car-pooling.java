class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        TreeMap<Integer , Integer> hash = new TreeMap<>();
        
        for(int[] i : trips){
            int start = i[1];
            int end = i[2];
            hash.put(start , hash.getOrDefault(start , 0)+i[0]);
            hash.put(end , hash.getOrDefault(end , 0)-i[0]);
        }
        
        
        
        int currPass = 0;
        for(int i: hash.keySet()){
            
            currPass+=hash.get(i);
            
            if(currPass>capacity) return false;
        }
        
        return true;
        
    }
}