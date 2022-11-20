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
    int sum = 0;
    
    public void calcSum(TreeNode root , boolean isLeft){
        if(root==null) return;
        else if(root.left==null && root.right==null){
            if(isLeft==true){
                sum+=root.val;
                return;
            }
        }
        
        calcSum(root.left , true);
        calcSum(root.right  , false);
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        calcSum(root , false);
        return sum;
    }
}