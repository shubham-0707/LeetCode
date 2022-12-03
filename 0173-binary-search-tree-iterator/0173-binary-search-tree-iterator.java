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
class BSTIterator {
    
    private int count;
    private List<Integer> ans;
    
    public void inorder(TreeNode root , List<Integer> ans){
        if(root==null) return;
        
        inorder(root.left , ans);
        ans.add(root.val);
        inorder(root.right , ans);
    }

    public BSTIterator(TreeNode root) {
        this.count = 0;
        this.ans = new ArrayList<>();
        inorder(root  , ans);
    }
    
    public int next() {
        return ans.get(count++);
    }
    
    public boolean hasNext() {
        if(count==ans.size()) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */