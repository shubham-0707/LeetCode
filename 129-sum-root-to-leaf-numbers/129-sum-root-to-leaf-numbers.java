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
    
    public void getPaths(TreeNode root , ArrayList<Integer> ans , String str){
        
        if(root==null) return;
        
        str=str+root.val+"";
        
        if(root.left==null && root.right==null){
            ans.add(Integer.valueOf(str));
            str=str.substring(0 , str.length()-1);
            return;
        }
        
        getPaths(root.left , ans , str);
        getPaths(root.right , ans , str);
        str = str.substring(0 , str.length()-1);
        return;
    }
    
    public int sumNumbers(TreeNode root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        getPaths(root , ans , "");
        
        int sum = 0;
        for(int i=0 ; i<ans.size(); i++){
            
            sum+=ans.get(i);
            
        }
        
        return sum;
        
        
        
    }
}