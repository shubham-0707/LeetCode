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
    int x_axis;
    int y_axis;
    TreeNode node;
    
    Tuple(int x_axis , int y_axis , TreeNode node){
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.node = node;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0 , 0 , root));
        
        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> hash = new TreeMap<>();
        
        while(!q.isEmpty()){
            Tuple temp = q.poll();
            
            int row = temp.x_axis;
            int col = temp.y_axis;
            TreeNode node = temp.node;
            
            if(!hash.containsKey(row)){
                hash.put(row , new TreeMap<Integer , PriorityQueue<Integer>>());
            }
            
            if(!hash.get(row).containsKey(col)){
                hash.get(row).put(col , new PriorityQueue<Integer>());
            }
            
            hash.get(row).get(col).add(node.val);
            
            if(node.left!=null){
                q.add(new Tuple(row-1 , col+1 , node.left));
            }
            
            if(node.right!=null){
                q.add(new Tuple(row+1 , col+1 , node.right));
            }
        }
        
        for(TreeMap<Integer , PriorityQueue<Integer>> p : hash.values()){
            List<Integer> temp = new ArrayList<>();
            for(PriorityQueue<Integer> pq : p.values()){
                while(!pq.isEmpty()){
                    temp.add(pq.peek());
                    pq.poll();
                }
            }
            ans.add(temp);
        }
        
        return ans;
    }
}