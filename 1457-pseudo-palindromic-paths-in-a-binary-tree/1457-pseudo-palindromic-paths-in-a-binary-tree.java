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
    private int count = 0;

    private void getPaths(TreeNode root , HashMap<Integer , Integer> hash) {
        if(root==null) return;

        if(hash.containsKey(root.val)) hash.remove(root.val);
        else hash.put(root.val , hash.getOrDefault(root.val , 0)+1);

        if(root.left == null && root.right == null) {
            if(hash.size()==1 || hash.size()==0) count++;
            return;
        }

        getPaths(root.left, new HashMap<Integer , Integer>(hash));
        getPaths(root.right , new HashMap<Integer, Integer>(hash));
        return;
    }

    public int pseudoPalindromicPaths (TreeNode root) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        getPaths(root , hash);
        return count;
    }
}