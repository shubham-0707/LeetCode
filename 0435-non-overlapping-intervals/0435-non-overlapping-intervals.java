class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a , b)->(a[1]-b[1]));
        
        
        
        
        int left = 0 ; 
        int right = 1;
        int n = intervals.length;
        int ans = 0;
        
        
        while(right<n){
            if(intervals[left][1]<=intervals[right][0]){
                left=right;
                right+=1;
            }
            else if(intervals[left][1]<=intervals[right][1]){
                ans++;
                right++;
            }
            else if(intervals[left][1]>intervals[right][1]){
                left=right;
                right++;
            }
        }
        return ans;
    }
}