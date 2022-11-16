/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public void postOrder(Node root , List<Integer> ans){
        if(root==null) return;
        
        if(root.children!=null){
            for(Node child : root.children){
                postOrder(child , ans);
            }
            ans.add(root.val);
        }
    }
    
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        
        postOrder(root , ans);
        
        return ans;
    }
}