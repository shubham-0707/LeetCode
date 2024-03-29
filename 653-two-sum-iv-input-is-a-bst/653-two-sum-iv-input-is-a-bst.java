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
    
    public void preorder(TreeNode root , HashMap<Integer , Integer> hash){
        if(root==null) return;
        
        hash.put(root.val , 1);
        preorder(root.left , hash);
        preorder(root.right , hash);
    }
    
    public boolean findTarget(TreeNode root, int k) {
        
        // hashmap is used to store the preorder of the tree in it....
        HashMap<Integer , Integer> hash = new HashMap<>();
        preorder(root , hash);
        
        // then hashmap is checked for the combination of two nodes which sums equals to k...
        for(int i : hash.keySet()){
            if(hash.containsKey(k-i) && (k-i)!=i){
                return true;
            }
        }
        return false;
        
        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}