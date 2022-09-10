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
    
    public void inorder(TreeNode root , TreeMap<Integer , TreeNode> tree , LinkedHashMap<Integer , TreeNode> hash){
        if(root==null) return;
        
        inorder(root.left , tree , hash);
        tree.put(root.val  , root);
        hash.put(root.val , root);
        inorder(root.right , tree , hash);
    }
     
    
    public void recoverTree(TreeNode root) {
        TreeNode first = null;
        TreeNode second = null;
        
        TreeMap<Integer , TreeNode> tree = new TreeMap<>();
        LinkedHashMap<Integer , TreeNode> hash = new LinkedHashMap<>();
        
        inorder(root , tree , hash);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:hash.keySet()){
            arr.add(i);
        }
        
        // for(int i : hash.keySet()){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // for(int i : tree.keySet()){
        //     System.out.print(i+" ");
        // }
        
        
        
        int x = 0;
        for(int i : tree.keySet()){
            if(first==null && i!=arr.get(x)){
                first = hash.get(i);
            }
            else if(first!=null && i!=arr.get(x)){
                second = hash.get(i);
            }
            x++;
        }
        
        int v = first.val;
        first.val = second.val;
        second.val = v;
        
    }
}