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
    
    public void path_Sum(List<Integer> temp , List<List<Integer>> ans , int target , TreeNode root){
        
        if(root==null) return;
        
        temp.add(root.val);
        
        if(root.left==null && root.right==null && target==root.val){
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        
        path_Sum(temp , ans , target-root.val , root.left);
        
        path_Sum(temp , ans , target-root.val , root.right);
        
        temp.remove(temp.size()-1);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> temp = new ArrayList<>();
        
        path_Sum(temp , ans , targetSum , root);
        
        return ans;
        
    }
}