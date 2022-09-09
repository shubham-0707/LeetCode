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
    
    public void invertBT(TreeNode root){
        if(root==null) return;
            
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        
        invertBT(root.left);
        invertBT(root.right);
    }
    
    public TreeNode invertTree(TreeNode root) {
        invertBT(root);
        return root;
    }
}