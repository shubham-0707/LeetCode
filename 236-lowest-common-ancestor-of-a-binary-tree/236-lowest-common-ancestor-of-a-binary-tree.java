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
    
    public boolean getPath(TreeNode root , TreeNode target , ArrayList<TreeNode> arr){
        if(root==null) return false;
        arr.add(root);
        if(root==target) return true;
        
        
        if(getPath(root.left , target , arr) || getPath(root.right , target , arr)){
            return true;
        }
        
        arr.remove(arr.size()-1);
        
        return false;
        
        
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> ans1 = new ArrayList<>();
        ArrayList<TreeNode> ans2 = new ArrayList<>();
        
        getPath(root , p , ans1);
        getPath(root , q , ans2);
        
        for(int i=0 ; i<ans1.size() ; i++){
            System.out.print(ans1.get(i).val+" ");
        }
        
        for(int i=0 ; i<ans2.size() ; i++){
            System.out.print(ans2.get(i).val+" ");
        }
        
        HashMap<TreeNode , Integer> hash = new HashMap<>();
        
        for(int i =0 ; i<ans1.size() ; i++){
            hash.put(ans1.get(i) , hash.getOrDefault(ans1.get(i) , 0)+1);
        }
        TreeNode ans = root;
        for(int i=0 ; i<ans2.size() ; i++){
            hash.put(ans2.get(i) , hash.getOrDefault(ans2.get(i) , 0)+1);
            
            if(hash.get(ans2.get(i))==2){
                ans=ans2.get(i);
            }
        }
        
        return ans;
    }
}