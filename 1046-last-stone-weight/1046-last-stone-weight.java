class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i=0 ; i<stones.length ; i++){
            temp.add(stones[i]);
        }
       Collections.sort(temp);
        while(temp.size()>=2){
            int y = temp.get(temp.size()-1);
            int x = temp.get(temp.size()-2);
            int n = temp.size();
            temp.remove(n-1);
            temp.remove(n-2);
            
            if(x!=y){
                temp.add(y-x);
            }
            
            Collections.sort(temp);
            
            if(temp.size()==0) return 0;
        }
        
        return temp.get(0);
    }
}