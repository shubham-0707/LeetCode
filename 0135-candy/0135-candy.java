class Solution {
    public int candy(int[] ratings) {
        
        if(ratings.length==1) return 1;
        
        int n = ratings.length;
        
        int[] candies = new int[ratings.length];
        Arrays.fill(candies , 1);
        
        
        while(true){
            boolean hasChanged = false;
            if(ratings[0]>ratings[1] && candies[0]<=candies[1]){
                candies[0] = candies[1]+1;
                hasChanged = true;
            }
            for(int i=1 ; i<ratings.length-1 ; i++){
                if(ratings[i]>ratings[i-1] && candies[i]<=candies[i-1]){
                    candies[i] = candies[i-1]+1;
                    hasChanged = true;
                }
                
                if(ratings[i]>ratings[i+1] && candies[i]<=candies[i+1]){
                    candies[i] = candies[i+1]+1;
                    hasChanged = true;
                }
            }
            
            if(ratings[n-1]>ratings[n-2] && candies[n-1]<=candies[n-2]){
                candies[n-1] = candies[n-2]+1;
                hasChanged = true;
            }
            
            
            if(hasChanged == false) break;
        }
        
        int sum = 0;
        for(int i=0 ; i<candies.length ; i++){
            sum+=candies[i];
        }
        
        return sum;
    }
}