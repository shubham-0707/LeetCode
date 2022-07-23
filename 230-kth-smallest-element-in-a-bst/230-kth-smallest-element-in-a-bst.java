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
    
    public static void inorder(TreeNode root , ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        
        inorder(root.left , arr);
        arr.add(root.val);
        inorder(root.right , arr);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        inorder(root , arr);
        
        int ans = 0;
        int i=0;
        while(i<k){
            ans=arr.get(i);
            i++;
        }
        return ans;
    }
}