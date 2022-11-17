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
    
    public void rightView(TreeNode root , List<Integer> ans , int index){
        if(root==null) return;
        
        if(index==ans.size()) ans.add(root.val);
        
        rightView(root.right , ans , index+1);
        
        rightView(root.left , ans , index+1);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        
        rightView(root , ans , 0);
        
        return ans;
    }
}