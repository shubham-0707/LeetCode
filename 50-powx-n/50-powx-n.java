class Solution {
    
    public static double pow(double x , int n){
        if(n==0) return 1;
        double temp = pow(x , n/2);
        double evenPower = temp*temp;
        
        if(n%2==0) return evenPower;
        
        return evenPower*x;
    }
    
    public double myPow(double x, int n) {
        if(n<0){
            return 1/pow(x , n);
        }
        return pow(x , n);
    }
}