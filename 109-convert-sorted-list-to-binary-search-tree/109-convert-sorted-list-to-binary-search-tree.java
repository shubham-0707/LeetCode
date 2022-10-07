/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    public static TreeNode solve(ArrayList<Integer> temp , int start , int end){
        if(start>end) return null;
        
        int mid = (start+end)/2;
        
        TreeNode root = new TreeNode(temp.get(mid));
        
        root.left = solve(temp , start , mid-1);
        
        root.right = solve(temp , mid+1 , end);
        
        return root;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        ListNode newnode = head;
        while(newnode!=null){
            temp.add(newnode.val);
            newnode = newnode.next;
        }
        
        return solve(temp , 0 , temp.size()-1);
    }
}