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
    
    public int findIndex(int[] inorder , int ele , int n){
        for(int i=0 ; i<n ; i++){
            if(inorder[i]==ele) return i;
        }
        return -1;
    }
    
    public TreeNode solve(int[] index , int[] preorder , int[] inorder , int inorderStart , int inorderEnd , int n){
        if(index[0]>=n || inorderStart>inorderEnd) return null;
        
        int ele = preorder[index[0]++];
        int pos = findIndex(inorder , ele , n);
        TreeNode root = new TreeNode(ele);
        
        root.left = solve(index , preorder , inorder, inorderStart , pos-1 , n);
        
        root.right = solve(index , preorder , inorder , pos+1 , inorderEnd , n);
        
        return root;
        
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] index = new int[1];
        index[0] = 0;
        
        return solve(index , preorder , inorder , 0 , inorder.length-1 , inorder.length);
        
    }
}