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
    public static void solve(TreeNode root , HashMap<Integer , Integer> hash){
        if(root==null){
            return;
        }
        hash.put(root.val , hash.getOrDefault(root.val , 0)+1);
        solve(root.left , hash);
        solve(root.right , hash);
    }
    
    public int[] findMode(TreeNode root) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        solve(root , hash);
        
        int maxi = Integer.MIN_VALUE;
        for(int i:hash.keySet()){
            maxi = Math.max(maxi , hash.get(i));
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:hash.keySet()){
            if(hash.get(i)==maxi){
                ans.add(i);
            }
        }
        
        int[] modi = new int[ans.size()];
        for(int i=0 ; i<ans.size() ; i++){
            modi[i] = ans.get(i);
        }
        
        return modi;
    }
}