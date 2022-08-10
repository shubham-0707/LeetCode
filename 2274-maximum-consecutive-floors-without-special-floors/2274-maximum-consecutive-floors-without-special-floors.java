class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        
        
        Arrays.sort(special);
        int maxi = 0;
        maxi = Math.max(special[0]-bottom , maxi);
        for(int i=1 ; i<special.length ; i++){
            maxi = Math.max(maxi , special[i]-special[i-1]-1);
        }
        maxi = Math.max(maxi , top-special[special.length-1]);
        
        return maxi;
    }
}