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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int num = q.size();
            for(int i=0 ; i<num ; i++){
                TreeNode curr = q.poll();
                temp.add(curr.val);
                
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                
            }
            
            if(flag==true){
                ans.add(temp);
                flag=false;
            }
            else{
                Collections.reverse(temp);
                ans.add(temp);
                flag = true;
            }
        }
        
        return ans;
    }
}