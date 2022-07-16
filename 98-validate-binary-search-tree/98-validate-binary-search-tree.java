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
    public void inorder(TreeNode root , ArrayList<Integer> ans){
        if(root==null) return;
        
        inorder(root.left , ans);
        ans.add(root.val);
        inorder(root.right , ans);
    }
    
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root , arr);
        
        for(int i=1 ; i<arr.size() ; i++){
            if(arr.get(i)<=arr.get(i-1)){
                return false;
            }
        }
        
        return true;
        
    }
}