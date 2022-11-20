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
    
    public boolean getPath(TreeNode root , List<TreeNode> arr , TreeNode target){
        if(root==null) return false;
        
        arr.add(root);
        
        if(root==target) return true;
        
        if(getPath(root.left , arr , target) || getPath(root.right , arr , target)){
            return true;
        }
        
        arr.remove(arr.size()-1);
        
        return false;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        List<TreeNode> arr1 = new ArrayList<>();
        List<TreeNode> arr2 = new ArrayList<>();
        
        getPath(root , arr1 , p);
        getPath(root , arr2 , q);
        
        HashMap<TreeNode , Integer> hash = new HashMap<>();
        for(int i=0 ; i<arr1.size() ; i++){
            hash.put(arr1.get(i) , hash.getOrDefault(arr1.get(i) , 0)+1);
        }
        
        TreeNode ans = root;
        
        for(int i=0 ; i<arr2.size(); i++){
            hash.put(arr2.get(i) , hash.getOrDefault(arr2.get(i) , 0)+1);
            
            if(hash.get(arr2.get(i))==2){
                ans = arr2.get(i);
            }
        }
        return ans;
    }
}