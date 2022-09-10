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
    
    private TreeNode prev;
    private TreeNode first;
    private TreeNode middle;
    private TreeNode last;
    
    
    public void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);
        
        if(root.val<prev.val){
            if(first==null){
                first=prev;
                middle = root;
            }
            else{
                last = root;
            }
        }
        
        prev=root;
        
        inorder(root.right);
        
    }
    
    
    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        first = middle = last = null;
        
        inorder(root);
        
        if(first!=null && last!=null){
            int v = first.val;
            first.val = last.val;
            last.val = v;
        }
        else if(first!=null && middle!=null){
            int v = first.val;
            first.val = middle.val;
            middle.val = v;
        }
        
    }
}