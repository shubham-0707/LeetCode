class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0 ; i<=n ; i++){
            int m = i;
            int count = 0;
            while(m>1) {
                count+=(m&1);
                m = m>>1;
            }
            ans[i] = count;
            if(i!=0) ans[i]++;
        }
        return ans;
    }
}