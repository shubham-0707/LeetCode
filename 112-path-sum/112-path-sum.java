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
    
    public boolean DFS(TreeNode root , int val){
        if(root.left==null && root.right == null && val==0)
            return true;
            
        
        boolean leftTree = false;
        boolean rightTree = false;
        
        if(root.left!=null)
            leftTree = DFS(root.left , val-root.left.val);
        if(root.right!=null)
            rightTree = DFS(root.right , val-root.right.val);
        
        return leftTree||rightTree;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null) return false;
        
        return DFS(root , targetSum-root.val);
        
        
    }
}