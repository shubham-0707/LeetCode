class Solution {
    public static boolean isSafe(int row , int col , char[][] boards){
        int temp_row = row;
        int temp_col = col-1;
        while(temp_col>=0){
            if(boards[row][temp_col]=='Q'){
                return false;
            }
            temp_col--;
        }
        
        temp_row = row-1;
        temp_col = col-1;
        
        while(temp_row>=0 && temp_col>=0){
            if(boards[temp_row][temp_col]=='Q'){
                return false;
            }
            temp_row--;
            temp_col--;
        }
        
        temp_row=row+1;
        temp_col=col-1;
        while(temp_row<=boards.length-1 && temp_col>=0){
            if(boards[temp_row][temp_col]=='Q'){
                return false;
            }
            temp_row++;
            temp_col--;
        }
        
        return true;
    }
    
    public static void saveAllboards(char[][] boards , List<List<String>> ans){
        List<String> temp_str = new ArrayList<>();
        
        for(int i=0 ; i<boards.length ; i++){
            String row_string = "";
            for(int j=0 ; j<boards.length ; j++){
                row_string+=boards[i][j];
            }
            temp_str.add(row_string);
        }
        ans.add(new ArrayList<>(temp_str));
    }
    
    public static void solve(char[][] boards , List<List<String>> ans , int col){
        if(col==boards.length){
            saveAllboards(boards , ans);
            return;
        }
        
        for(int row=0; row<boards.length ; row++){
            if(isSafe(row , col , boards)){
                boards[row][col] = 'Q';
                solve(boards , ans , col+1);
                boards[row][col]='.';
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        char[][] boards = new char[n][n];
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                boards[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        solve(boards , ans , 0);
        
        return ans;
    }
}