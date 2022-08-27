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
    public int findBottomLeftValue(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = root.val;
        
        while(!q.isEmpty()){
            int num = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0 ; i<num ; i++){
                TreeNode curr = q.poll();
                
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                
                temp.add(curr.val);
            }
            ans = temp.get(0);
        }
        return ans;
    }
}