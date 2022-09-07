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
    
    public void binaryTreePaths(TreeNode root , List<String> ans , String str){
        if(root==null) return;
        
        str+=root.val+"->";
        
        if(root.left==null && root.right==null){
            str = str.substring(0 , str.length()-2);
            ans.add(str);
            String temp = root.val+"";
            int len = temp.length();
            str.substring(0 , str.length()-len);
            return;
        }
        
        String temp2 = root.val+"";
        int len2 = temp2.length();
        binaryTreePaths(root.left , ans , str);
        binaryTreePaths(root.right , ans , str);
        str.substring(0 , str.length()-len2);
        return;
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ans = new ArrayList<>();
        
        binaryTreePaths(root , ans , "");
        
        return ans;
    }
}