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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            int count = 0;
            
            int num = q.size();
            
            for(int i=0 ; i<num ; i++){
                TreeNode curr = q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                
                if(curr.left!=null && curr.right!=null){
                    if((curr.left.val==x && curr.right.val==y) || (curr.left.val==y && curr.right.val == x)){
                        return false;
                    }
                }
                
                if(curr.left!=null && (curr.left.val==x || curr.left.val==y)){
                    count++;
                }
                
                if(curr.right!=null && (curr.right.val==x || curr.right.val==y)){
                    count++;
                }
                
                if(count==2){
                    return true;
                }
                
            }
            
        }
        
        return false;
        
    }
}