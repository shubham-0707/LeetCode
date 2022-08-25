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
    public int maxDepth(TreeNode root) {
        // maximum depth of a binary tree...
        
        if(root==null) return 0;
        
        return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}