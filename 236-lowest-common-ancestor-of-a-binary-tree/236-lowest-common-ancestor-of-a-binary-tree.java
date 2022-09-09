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
    
    public boolean getPaths(ArrayList<TreeNode> temp , TreeNode root , TreeNode target){
        if(root==null) return false;
        
        temp.add(root);
        if(root==target){
            return true;
        }
        if(getPaths(temp , root.left  , target) || getPaths(temp , root.right , target)){
            return true;
        }
        
        temp.remove(temp.size()-1);
        return false;
        
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> arr1 = new ArrayList<>();
        ArrayList<TreeNode> arr2 = new ArrayList<>();
        
        getPaths(arr1 , root , p);
        getPaths(arr2 , root , q);
        
        HashMap<TreeNode , Integer> hash = new HashMap<>();
        for(int i=0 ; i<arr1.size() ; i++){
            hash.put(arr1.get(i) , hash.getOrDefault(arr1.get(i) , 0)+1);
        }
        TreeNode ans = root;
        for(int i=0 ; i<arr2.size() ; i++){
            hash.put(arr2.get(i) , hash.getOrDefault(arr2.get(i) , 0)+1);
            
            if(hash.get(arr2.get(i))==2){
                ans=arr2.get(i);
            }
        }
        
        return ans;
    }
}