// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here...
        
        ArrayList<Integer> arr =  new ArrayList<>();
        
        int left = 0;
        int right = c-1;
        int top = 0;
        int bottom = r-1;
        
        int total = r*c;
        int count = 0;
        
        while(count<total){
            
            for(int i=left ; count<total&&i<=right ; i++){
                arr.add(matrix[top][i]);
                count++;
            }
            top++;
            
            
            for(int i=top ; count<total && i<=bottom ; i++){
                arr.add(matrix[i][right]);
                count++;
            }
            right--;
            
            for(int i=right ; count<total&&i>=left ; i--){
                arr.add(matrix[bottom][i]);
                count++;
            }
            bottom--;
            
            for(int i=bottom ; count<total && i>=top ; i--){
                arr.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return arr;
    }
}
