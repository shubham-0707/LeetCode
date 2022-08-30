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
    
    public static int diameterTree(TreeNode root , int[] diameter){
        if(root==null) return 0;
        
        int lh = diameterTree(root.left , diameter);
        
        int rh = diameterTree(root.right  , diameter);
        
        diameter[0] = Math.max(diameter[0] , lh+rh);
        
        return 1 + Math.max(lh , rh);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        
        int[] diameter = new int[1];
        
        diameterTree(root , diameter);
        
        return diameter[0];
        
    }
}