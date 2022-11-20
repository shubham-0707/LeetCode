class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) 
    {
        
        HashSet <Integer> map =new HashSet<>();
        map.add(0);
            Stack <Integer> stack= new Stack<>();
            stack.add(0);
            while(!stack.isEmpty()){
             List<Integer> keys = rooms.get(stack.pop());
            
                for(int key: keys)
                {
                    if(!map.contains(key))
                    {
                      map.add(key);
                     stack.add(key);
                    }
                }
            }
    return (map.size()==rooms.size());
    }
}