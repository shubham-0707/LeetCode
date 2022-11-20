class Solution {
     public int findJudge(int n, int[][] trust) {
        int[] row = new int[n+1];
        int[] col = new int[n+1];

        for(int i=0;i<trust.length;i++) {
            row[trust[i][0]]++;
            col[trust[i][1]]++;
        }
        for(int i=1;i<=n;i++) 
            if(col[i]==n-1 && row[i]==0)
                return i;        
            
        return -1;
    }
}