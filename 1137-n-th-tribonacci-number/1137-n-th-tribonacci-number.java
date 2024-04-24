class Solution {
    int[] dp;
    public int tribonacci(int n) {
        this.dp = new int[n+1];
        Arrays.fill(dp , -1);
        return solve(n);
    }

    private int solve(int n) {
        if(n==0 || n==1) return n;
        else if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        int a = solve(n-1) + solve(n-2) + solve(n-3);
        return dp[n] = a;
    } 
}