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
    
    public boolean recur(TreeNode root1 , TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        
        return root1.val==root2.val && recur(root1.left , root2.left) && recur(root1.right , root2.right);
        
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return recur(p , q);
        
    }
}