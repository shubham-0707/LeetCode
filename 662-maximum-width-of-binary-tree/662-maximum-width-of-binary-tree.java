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
class Pair{
    int index;
    TreeNode root;
    
    Pair(int index , TreeNode root){
        this.index = index;
        this.root = root;
    }
}


class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        int maxi = 0;
        Deque<Pair> q = new LinkedList<>();
        q.add(new Pair(1 , root));
        
        while(!q.isEmpty()){
            int num = q.size();
            int left = q.peek().index;
            int right = q.getLast().index;
            
            maxi = Math.max(maxi , right-left+1);
            
            for(int i=0 ; i<num ; i++){
                Pair p = q.poll();
                int idx = p.index;
                TreeNode curr = p.root;
                
                if(curr.left!=null) q.add(new Pair(2*(idx-1)+1 , curr.left));
                if(curr.right!=null) q.add(new Pair(2*(idx-1)+2 , curr.right));
                
            }
        }
        
        return maxi;
        
    }
}