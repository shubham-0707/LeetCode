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
    public static void inorder(TreeNode root , HashSet<Integer> set){
        if(root==null) return;
        
        inorder(root.left , set);
        set.add(root.val);
        inorder(root.right , set);
    }
    
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        
        inorder(root , set);
        
        List<Integer> lst = new ArrayList<Integer>(set);
        Collections.sort(lst);
        if(lst.size()<2){
            return -1;
        }
        
        return lst.get(1);
    }
}