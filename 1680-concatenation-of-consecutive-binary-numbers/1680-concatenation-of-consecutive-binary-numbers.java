class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1000000007;
        int sum = 0;
        long ans = 0;
        for(int i=1 ; i<=n ; i++){
            int value = i;
            
            while(value!=0){
                value = value>>1;
                ans = (ans<<1)%mod;
            }
            ans = (ans+i)%mod;
        }
        
        return (int)ans;
    }
}