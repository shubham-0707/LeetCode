class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int start = 0;
        int end = matrix.length-1;
        
        int row = -1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(matrix[mid][0]==target){
                return true;
            }
            else if(matrix[mid][0]<target){
                start=mid+1;
                row = mid;
            }
            else{
                end = mid-1;
            }
        }
        
        if(row==-1){
            return false;
        }
        
        start = 0;
        end = matrix[0].length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}