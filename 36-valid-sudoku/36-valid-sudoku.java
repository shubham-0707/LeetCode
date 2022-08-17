class Solution {
    
    public static boolean isValid(char[][] board , int row , int col , char ch){
        
        for(int i=0 ; i<board.length ; i++){
            
            if(board[i][col]==ch && i!=row){
                return false;
            }
            
            if(board[row][i]==ch && i!=col){
                return false;
            } 
            
            if(board[3*(row/3)+i/3][3*(col/3) + i%3]==ch && (3*(row/3)+i/3)!=row && (3*(col/3)+i%3)!=col){
                return false;
            }
            
        }
        
        return true;
    }
    
    public static boolean solve(char[][] board){
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board.length ; j++){
                if(board[i][j]!='.'){
                    if(isValid(board , i , j , board[i][j])==false){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }
}