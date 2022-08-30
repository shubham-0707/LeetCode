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
    
    public static void preorder(TreeNode root , List<Integer> arr){
        if(root==null) return;
        
        arr.add(root.val);
        preorder(root.left , arr);
        preorder(root.right , arr);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        
        preorder(root , ans);
        
        return ans;
        
        
        // Time Complexity : O(N)
        // Space Complexity : O(1)
        
    }
}