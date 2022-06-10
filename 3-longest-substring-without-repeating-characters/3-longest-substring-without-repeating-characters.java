class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int n = s.length();
        int maxi = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            int count = 0;
            int[] arr = new int[256];
            for(int j=i ; j<n ; j++){
                if(arr[s.charAt(j)-0]<1){
                    arr[s.charAt(j)-0]++;
                    count++;
                }
                else{
                    break;
                }
            }
            maxi = Math.max(maxi , count);
        }
        return maxi;
    }
}