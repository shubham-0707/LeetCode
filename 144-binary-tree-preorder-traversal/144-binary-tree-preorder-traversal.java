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
    
    public void preorder(TreeNode root , ArrayList<Integer> ans){
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            
            TreeNode curr = st.pop();
            ans.add(curr.val);
            
            if(curr.right!=null) st.push(curr.right);
            if(curr.left!=null) st.push(curr.left);
        }
        
        return;
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        
        preorder(root , ans);
        
        return ans;
        
    }
}