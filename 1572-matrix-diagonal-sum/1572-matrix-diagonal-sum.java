class Solution {
    public int diagonalSum(int[][] mat) {
        
        //primary diagonal sum...
        int sum1=0;
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat.length ; j++){
                if(i==j){
                    sum1+=mat[i][j];
                }
            }
        }
        
        // secondary diagonal sum..
        int sum2=0;
        int n = mat.length+1;
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat.length ; j++){
                if((i+1)+(j+1)==n){
                    sum2+=mat[i][j];
                }
            }
        }
        
        
        if(mat.length%2==1){
            sum2=sum2-mat[(n/2)-1][(n/2)-1];
        }
        
        
        return sum1+sum2;
    }
}