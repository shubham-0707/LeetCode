class Solution {
    public int trap(int[] height) {
        
        if(height.length==0){
            return 0;
        }
        
     int size = height.length;
     int[] left_max = new int[size];
     int[] right_max = new int[size];
        
        left_max[0] = height[0];
        right_max[size-1] = height[size-1];
        
        for(int i=1 ; i<size ; i++){
            left_max[i] = Math.max(height[i] , left_max[i-1]);
        }
        
        for(int i=size-2 ; i>=0 ; i--){
            right_max[i] = Math.max(height[i] , right_max[i+1]);
        }
        
        int ans = 0;
        for(int i=1 ; i<size ; i++){
            ans+=Math.min(left_max[i] , right_max[i]) - height[i];
        }
        
        return ans;
    }
}