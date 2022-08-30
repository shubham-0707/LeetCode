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
    
    public static TreeNode insertBST(TreeNode root , int key){
        if(root==null){
            root = new TreeNode(key);
        }
        
        if(key<root.val){
            root.left = insertBST(root.left , key);
        }
        else if(key>root.val){
            root.right = insertBST(root.right , key);
        }
        
        return root;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root = null;
        
        for(int i=0 ; i<preorder.length ; i++){
            root = insertBST(root , preorder[i]);
        }
        
        return root;
        
    }
}