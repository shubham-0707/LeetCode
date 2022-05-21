class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0 ; i<candyType.length ; i++){
            set.add(candyType[i]);
        }
        
        int size1 = set.size();
        int size2 = candyType.length/2;
        
        if(size1<size2){
            return size1;
        }
        return size2;
    }
}