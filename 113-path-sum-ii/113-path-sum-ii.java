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
    
    public static void paths(TreeNode root , int sum , List<List<Integer>> ans , List<Integer> temp){
        
        if(root==null) return;
        
        temp.add(root.val);
        
        if(root.left==null && root.right==null && root.val==sum)
            ans.add(new ArrayList<>(temp));
        
        paths(root.left , sum-root.val , ans , temp);
        paths(root.right , sum-root.val , ans ,temp);
        
        temp.remove(temp.size()-1);
        
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> temp = new ArrayList<>();
        
        paths(root , targetSum , ans , temp);
        
        
        return ans;
    }
}