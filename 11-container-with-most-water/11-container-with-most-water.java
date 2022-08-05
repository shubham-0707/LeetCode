class Solution {
    public int maxArea(int[] arr) {
        
        // initialising the maximum water variable..
        int maxi = 0;
        
        int i = 0;
        int j = arr.length-1;
        
        // using two pointer approach...
        while(i<j){
            int area = Math.min(arr[i] , arr[j])*(j-i);
            maxi = Math.max(maxi , area);
            
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        // Time Complexity : O(N)
        // Space Complexity : O(1)
        return maxi;
    }
}