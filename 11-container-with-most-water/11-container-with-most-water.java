class Solution {
    public int maxArea(int[] height) {
        int maxi =0;
        
        int i=0;
        int j=height.length-1;
        int left_max = height[0];
        int right_max = height[height.length-1];
        
        while(i<j){
            if(height[i]<height[j]){
                int area = Math.min(height[i] , height[j])*(j-i);
                maxi = Math.max(maxi , area);
                i++;
            }
            else{
                int area = Math.min(height[i] , height[j])*(j-i);
                maxi = Math.max(maxi , area);
                j--;
            }
        }
        
        return maxi;
    }
}