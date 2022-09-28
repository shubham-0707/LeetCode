class Solution {
    public int[][] merge(int[][] intervals) {
        
        // Sorting the intervals array based on the first value of the intenal arrays of size 2...
        Arrays.sort(intervals , (a , b)->(a[0]-b[0]));
        
        // forming a linked list
        LinkedList<int[]> list = new LinkedList<>();
        
        
        // applying the logic to merge the intervals...
        for(int[] i : intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<i[0]){
                list.add(i);
            }
            else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1] , i[1]);
            }
        }
        
        
        // inserting the intervals from linked list to the answer array....
        int[][] ans = new int[list.size()][2];
        
        for(int i=0 ; i<list.size() ; i++){
            ans[i] = list.get(i);
        }
        
        return ans;
        
        // Time Complexity : O(n*logn)
        // Space Complexity : O(n)
        
    }
}