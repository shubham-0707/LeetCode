class Solution {
    public int maxArea(int h, int w, int[] hCuts, int[] vCuts) {
        Arrays.sort(hCuts);
        Arrays.sort(vCuts);
        
        int hMaxi = Math.max(hCuts[0] , h-hCuts[hCuts.length-1]);
        int vMaxi = Math.max(vCuts[0] , w-vCuts[vCuts.length-1]);
        
        for(int i=1 ; i<hCuts.length ; i++){
            hMaxi = Math.max(hMaxi , hCuts[i]-hCuts[i-1]);
        }
        
        for(int i=1 ; i<vCuts.length ; i++){
            vMaxi = Math.max(vMaxi , vCuts[i]-vCuts[i-1]);
        }
        
        return (int)((long)(vMaxi%1000000007) * (hMaxi%1000000007) % 1000000007);
    }
}