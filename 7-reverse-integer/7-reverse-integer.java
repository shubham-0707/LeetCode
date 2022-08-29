class Solution {
    public int reverse(int x) {
        
        long sum = 0;
        boolean flag = true;
        if(x<0){
            flag = false;
            x = x*(-1);
        }
        
        while(x>0){
            int res = x%10;
            sum = sum * 10 + res;
            x = x/10;
        }
        
        if(!flag){
            sum = (-1)*sum;
        }
        
        if(sum<(long)Math.pow(2 , 31)*(-1) || sum>(long)Math.pow(2 , 31)-1){
            return 0;
        }
        
        return (int)sum;
    }
}