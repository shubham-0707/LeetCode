class Solution {
    
    public static void saveAllboards(ArrayList<ArrayList<String>> ans , char[][] boards){
        ArrayList<String> temp_arr = new ArrayList<>();
        
        for(int i=0 ; i<boards.length ; i++){
            String str = "";
            for(int j=0 ; j<boards.length ; j++){
                str+=boards[i][j];
            }
            temp_arr.add(str);
        }
        ans.add(new ArrayList<>(temp_arr));
    }
    
    public static boolean isSafe(char[][] boards , int row , int col){
        int temp_row = row;
        int temp_col = col-1;
        
        while(temp_col>=0){
            if(boards[temp_row][temp_col]=='Q'){
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
    
    public static void solve(char[][]boards , ArrayList<ArrayList<String>> ans , int col){
        if(col==boards.length){
            saveAllboards(ans , boards);
            return;
        }
        
        for(int row = 0; row<boards.length ; row++){
            if(isSafe(boards , row , col)){
                boards[row][col]='Q';
                solve(boards , ans , col+1);
                boards[row][col]='.';
            }
        }
    }
    
    public int totalNQueens(int n) {
        char[][] boards = new char[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                boards[i][j]='.';
            }
        }
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        solve(boards , ans  , 0);
        return ans.size();
    }
}