class Solution {
    public int largestAltitude(int[] gain) {
        
        
        // initialising the initial altitude as 0...
        int alti = 0;
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0 ; i<gain.length ; i++){
            maxi = Math.max(maxi , alti);
            alti = alti+gain[i];
        }
        maxi = Math.max(maxi , alti);
        return maxi;
    }
}