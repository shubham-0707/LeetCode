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
    TreeNode root;
    int count = 0;
    ArrayList<Integer> ans = new ArrayList<>();
    public void inorder(ArrayList<Integer> ans  , TreeNode root){
        if(root==null) return;
        
        inorder(ans , root.left);
        ans.add(root.val);
        inorder(ans  , root.right);
    }
    public BSTIterator(TreeNode root) {
        this.root = root;
        inorder(ans , root);
    }
    
    public int next() {
        int temp = ans.get(count);
        count++;
        return temp;
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