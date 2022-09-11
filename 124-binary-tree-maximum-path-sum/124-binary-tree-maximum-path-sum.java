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
    
    public int maxiSum(TreeNode root , int[] maxi){
        
        if(root==null) return 0;
        
        int lh = Math.max(0 , maxiSum(root.left , maxi));
        int rh = Math.max(0 , maxiSum(root.right , maxi));
        
        maxi[0] = Math.max(maxi[0] , root.val + lh + rh);
        
        return root.val + Math.max(lh , rh);
        
    }
    
    public int maxPathSum(TreeNode root) {
        
        int[] maxi = new int[1];
        
        maxi[0] = Integer.MIN_VALUE;
        
        maxiSum(root , maxi);
        
        return maxi[0];
        
    }
}