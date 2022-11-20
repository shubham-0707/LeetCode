/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder str = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr==null){
                str.append("n"+" ");
                continue;
            }
            str.append(curr.val+" ");
            q.add(curr.left);
            q.add(curr.right);
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        if(data.length()==0) return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] str = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        q.add(root);
        
        for(int i=1 ; i<str.length ; i++){
            TreeNode curr = q.poll();
            if(!str[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(str[i]));
                curr.left = left;
                q.add(left);
            }
            if(!str[++i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(str[i]));
                curr.right = right;
                q.add(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;