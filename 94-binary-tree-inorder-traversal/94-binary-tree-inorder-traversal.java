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
    
    public void inorder(TreeNode root , List<Integer> ans){
        TreeNode curr = root;
        Stack<TreeNode> st = new Stack<>();
        
        while(!st.isEmpty() || curr!=null){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                TreeNode temp = st.pop();
                ans.add(temp.val);
                curr = temp.right;
            }
        }
    }
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        
        inorder(root , ans);
        
        return ans;
    }
}