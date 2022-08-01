class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals , (a, b)->a[0]-b[0]);
        
        LinkedList<int[]> lst = new LinkedList<>();
        
        for(int[] row : intervals){
            if(lst.isEmpty() || lst.getLast()[1]<row[0]){
                lst.add(row);
            }
            else{
                lst.getLast()[1] = Math.max(row[1] , lst.getLast()[1]);
            }
        }
        
        return lst.toArray(new int[lst.size()][]);
    }
}