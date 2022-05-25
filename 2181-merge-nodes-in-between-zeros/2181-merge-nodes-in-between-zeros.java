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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode newnode=head.next;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(newnode!=null){
            if(newnode.val==0){
                arr.add(sum);
                sum = 0;
            }
            else{
                sum+=newnode.val;
            }
            newnode=newnode.next;
        }
        
        ListNode prevNode = null;
        newnode=head;
        int n = arr.size();
        for(int i=0 ; i<arr.size() ; i++){
            newnode.val = arr.get(i);
            prevNode = newnode;
            newnode = newnode.next;
        }
        prevNode.next=null;
        
        return head;
    }
}