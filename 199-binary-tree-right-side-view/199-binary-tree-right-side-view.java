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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        
        q.add(root);
        
        while(!q.isEmpty()){
            
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            while(size-- > 0){
                TreeNode node = q.poll();
                
                temp.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            
            result.add(temp);
        }
        
        for(List<Integer> i : result){
            ans.add(i.get(i.size()-1));
        }
        
        return ans;
    }
}