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
    
    public void preorder(List<Integer> ans , TreeNode root){
        if(root==null) return;
        
        ans.add(root.val);
        preorder(ans , root.left);
        preorder(ans , root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
         
        preorder(ans , root);
        return ans;
        
    }
}