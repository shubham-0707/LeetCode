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
    TreeNode root;
    int index;
    
    Pair(TreeNode root , int index){
        this.root=root;
        this.index=index;
    }
}
class Solution {
    
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null) return 0;
        
        ArrayList<Pair> ans = new ArrayList<>();
        Deque<Pair> q = new LinkedList<>();
        q.add(new Pair(root , 1));
        int maxi = 1;
        
        while(!q.isEmpty()){
            
            int num = q.size();
            int left = q.peek().index;
            int right = q.getLast().index;
            
            maxi = Math.max(maxi , right-left+1);
            
            for(int i=0 ; i<num ; i++){
            
            Pair curr = q.poll();
            TreeNode temp_root = curr.root;
            int idx = curr.index;
            
            if(temp_root.left!=null){
                q.add(new Pair(temp_root.left , 2*(idx-1)+1));
            }
                
            if(temp_root.right!=null){
                q.add(new Pair(temp_root.right , 2*(idx-1)+2));
            }
                
            }  
        }
        
        return maxi;
    }
}