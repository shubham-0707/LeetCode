class Solution {
    
    public void solve(int[][] image , int rows , int cols , int source , int sr, int sc , int newColor){
        if(sr<0 || sc<0 || sr>=rows || sc>=cols) return;
        
        else if(image[sr][sc]!=source) return;
        
        image[sr][sc] = newColor;
        
        solve(image , rows , cols , source , sr , sc-1 , newColor); // left
        solve(image , rows , cols , source , sr , sc+1 , newColor); //right
        solve(image , rows , cols , source , sr-1 , sc , newColor); //up
        solve(image , rows , cols , source  , sr+1 , sc , newColor); //down
            
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc]==color) return image;
        
        int rows = image.length;
        int cols = image[0].length;
        int source = image[sr][sc];
        
        solve(image , rows , cols , source , sr , sc , color);
        
        
        return image;
        
        
    }
}