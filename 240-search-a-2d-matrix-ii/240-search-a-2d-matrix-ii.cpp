class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix[0].size();
        bool flag = false;
        int rowIndex = 0;
        int colIndex = n-1;
        while(rowIndex<m && colIndex>=0){
            if(matrix[rowIndex][colIndex]==target){
                return true;
            }
            else if(matrix[rowIndex][colIndex]>target){
                colIndex--;
            }
            else{
                rowIndex++;
            }
        }
        return flag;
    }
};