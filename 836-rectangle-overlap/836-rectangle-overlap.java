class Solution {
    public final long MOD = (long)(Math.pow(10 , 9)+7);
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        long overlap=0;
        
        long left = (long)Math.max(rec1[0] , rec2[0])%MOD;
        long right = (long)Math.min(rec1[2] , rec2[2])%MOD;
        long bottom = (long)Math.max(rec1[1] , rec2[1])%MOD;
        long top = (long)Math.min(rec1[3] , rec2[3])%MOD;
        
        if(left<right && bottom<top){
            
            overlap = (((right-left)%MOD)*((top-bottom)%MOD))%MOD;
        }
        
        return overlap>0;
    }
}