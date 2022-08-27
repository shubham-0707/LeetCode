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
    
    public boolean isSymmetric2(TreeNode left , TreeNode right){
        if(left==null || right==null) return left==right;
        
        if(left.val !=right.val) return false;
        
        return isSymmetric2(left.left , right.right) 
               &&                                  
               isSymmetric2(left.right , right.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null) return true;
        
        return isSymmetric2(root.left , root.right);
    
    }
}