class Solution {
    public boolean judgeSquareSum(int c) {
        
        
        int sqrt = (int)Math.sqrt(c)+1;
        
        for(int i=0 ; i<=sqrt ; i++){
            long prod = i*i;
            
            long d = c-prod;
            double x = Math.sqrt(d);
            int y = (int)Math.sqrt(d);
            
            if(x-y==0) return true;
            
        }
        
        return false;
        
    }
}