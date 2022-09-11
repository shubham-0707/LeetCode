/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int findPosition(int[] inorder , int ele , int n){
        for(int i=0 ; i<n ; i++){
            if(inorder[i]==ele){
                return i;
            }
        }
        return -1;
    }
    
    
    public TreeNode solve(int[] inorder , int[] postorder , int[] index , int inorderStart , int inorderEnd , int n){
        if(index[0]<0 || inorderStart>inorderEnd){
            return null;
        }
        
        int ele = postorder[index[0]--];
        TreeNode root = new TreeNode(ele);
        int pos = findPosition(inorder , ele , n);
        
        
                root.right = solve(inorder , postorder , index , pos+1 , inorderEnd , n);
        
        root.left = solve(inorder , postorder , index , inorderStart , pos-1 , n);

        
        return root;
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int n = inorder.length;
        int[] index = new int[1];
        index[0] = n-1;
        
        TreeNode ans = solve(inorder , postorder , index , 0 , n-1 , n);
        
        return ans;
        
    }
}