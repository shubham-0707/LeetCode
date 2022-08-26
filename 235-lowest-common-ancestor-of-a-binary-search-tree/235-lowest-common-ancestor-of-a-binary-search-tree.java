/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public void path(TreeNode root , ArrayList<TreeNode> arr , TreeNode k){
        if(root.val==k.val){
            arr.add(root);
            return;
        }
        else if(k.val<root.val){
            arr.add(root);
            path(root.left , arr , k);
        }
        else{
            arr.add(root);
            path(root.right , arr , k);
        }
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> arr1 = new ArrayList<>();
        ArrayList<TreeNode> arr2 = new ArrayList<>();
        
        arr1.add(root);
        arr2.add(root);
        
        if(p.val!=root.val){
            if(p.val<root.val){
                path(root.left , arr1 , p);
            }
            else{
                path(root.right , arr1 , p);
            }
        }
        if(q.val!=root.val){
            if(q.val<root.val){
                path(root.left , arr2 , q);
            }
            else{
                path(root.right , arr2 , q);
            }
        }
        
        TreeNode ans = root;
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<arr1.size() ; i++){
            hash.put(arr1.get(i).val , hash.getOrDefault(arr1.get(i).val , 0)+1);
        }
        
        for(int i=0 ; i<arr2.size() ; i++){
            hash.put(arr2.get(i).val , hash.getOrDefault(arr2.get(i).val , 0)+1);
            if(hash.get(arr2.get(i).val)==2){
                ans=arr2.get(i);
            }
        }
        
        return ans;
        
        
    }
}