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
    
    public int getGoodNodes(TreeNode root , int currMax){
        if(root==null) return 0;
        
        int amount = 0;
        
        if(root.val>=currMax){
            amount++;
            currMax = root.val;
        }
        
        amount+=getGoodNodes(root.left , currMax);
        
        amount+=getGoodNodes(root.right , currMax);
        
        return amount;
        
    }
    
    public int goodNodes(TreeNode root) {
        
        if(root==null) return 0;
        
        int count = 0;
        
        count += getGoodNodes(root , Integer.MIN_VALUE);
        
        return count;
        
    }
}