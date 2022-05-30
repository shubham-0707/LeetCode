class Solution {
    
    public boolean isPossible(int[] piles , int mid , int h){
        int time = 0;
        for(int num:piles){
            time+=Math.ceil(num*1.0/mid);
            if(time>h) return false;
        }
        return true;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        int ans = 0;
        
        for(int i:piles){
            end = Math.max(end , i);
        }
        
        while(start<=end){
            
            int mid = start + (end-start)/2;
            
            if(isPossible(piles , mid , h)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return ans;
    }
}