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
    
    public static int pathSum(TreeNode root , int[] diameter){
        if(root==null) return 0;
        
        int lh = Math.max(0 , pathSum(root.left , diameter));
        
        int rh = Math.max(0 , pathSum(root.right , diameter));
        
        diameter[0] = Math.max(diameter[0] , lh+rh+root.val);
        
        return root.val + Math.max(lh , rh);
    }
    
    public int maxPathSum(TreeNode root) {
        
        int[] diameter = new int[1];
        diameter[0] = Integer.MIN_VALUE;
        
        pathSum(root , diameter);
        
        return diameter[0];
        
    }
}