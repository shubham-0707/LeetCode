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

class Tuple{
    int x;
    int y;
    TreeNode root;
    
    Tuple(int x , int y , TreeNode root){
        this.x = x;
        this.y = y;
        this.root = root;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        
        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> hash = new TreeMap<>();
        
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0 , 0 , root));
        
        while(!q.isEmpty()){
            Tuple t = q.poll();
            int x_line = t.x;
            int y_line = t.y;
            TreeNode curr = t.root;
            
            if(!hash.containsKey(x_line)){
                hash.put(x_line , new TreeMap<Integer , PriorityQueue<Integer>>());
            }
            
            if(!hash.get(x_line).containsKey(y_line)){
                hash.get(x_line).put(y_line , new PriorityQueue<Integer>());
            }
            
            hash.get(x_line).get(y_line).add(curr.val);
            
            if(curr.left!=null) q.add(new Tuple(x_line-1 , y_line+1 , curr.left));
            
            if(curr.right!=null) q.add(new Tuple(x_line+1 , y_line+1 , curr.right));
            
        }
        
        for(TreeMap<Integer , PriorityQueue<Integer>> tree : hash.values()){
            List<Integer> temp = new ArrayList<>();
            for(int h : tree.keySet()){
                PriorityQueue<Integer> pq = tree.get(h);
                while(!pq.isEmpty()){
                    temp.add(pq.poll());
                }
            }
            ans.add(temp);
        }
        
        return ans;
        
    }
}