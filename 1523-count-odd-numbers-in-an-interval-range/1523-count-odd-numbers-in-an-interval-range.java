class Solution {
    public int countOdds(int low, int high) {
        
        if(high%2==0 && low%2==0){
            return (high-low)/2;
        }
        else if(high%2==1 && low%2==1){
            return (high-low)/2+1;
        }
        return (high-low+1)/2;
    }
}