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
    String ans = "~";
    public void getPaths(TreeNode root, String str){
        if(root==null) return;
        
        str+=(char)(root.val+'a')+"";
        
        if(root.left==null && root.right==null){
            
            String temp = str;
            char[] ch = temp.toCharArray();
            int start = 0;
            int end = temp.length()-1;
            
            while(start<end){
                char chr = ch[start];
                ch[start] = ch[end];
                ch[end] = chr;
                start++;
                end--;
            }
            
            temp = new String(ch);
            if(temp.compareTo(ans)<0){
                ans = temp;
            }
            
            str=str.substring(0 , str.length()-1);
            return;
        }
        
        getPaths(root.left ,str);
        getPaths(root.right ,str);
        str = str.substring(0 , str.length()-1);
        return;
    }
    
    public String smallestFromLeaf(TreeNode root) {
        
        getPaths(root , "");
        
        return ans;
        
    }
}