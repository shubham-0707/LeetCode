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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode prevNode = head.next;
        while(prevNode.next!=null && prevNode.next.next!=null){
            ListNode currNode = prevNode.next;
            ListNode nextNode = prevNode.next.next;
            
            prevNode.next=nextNode;
            currNode.next = nextNode.next;
            nextNode.next = currNode;
            
            prevNode = prevNode.next.next;
        }
        
        ListNode p4 = head.next;
        head.next = p4.next;
        p4.next=head;
        head=p4;
        
        
        return head;
        
    }
}