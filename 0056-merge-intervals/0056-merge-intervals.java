class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a , b)->(a[0]-b[0]));
        
        //Applying the logic to form the merged list...
        
        ArrayList<int[]> arr = new ArrayList<>();
        
        for(int[] i : intervals){
            if(arr.size()==0 || arr.get(arr.size()-1)[1]<i[0]){
                arr.add(i);
            }
            else if(arr.get(arr.size()-1)[1]>=i[0]){
                arr.get(arr.size()-1)[1] = Math.max(arr.get(arr.size()-1)[1] , i[1]);
            }
        }
        
        int[][] ans = new int[arr.size()][2];
        for(int i=0 ; i<arr.size() ; i++){
            ans[i] = arr.get(i);
        }
        
        return ans;
    }
}