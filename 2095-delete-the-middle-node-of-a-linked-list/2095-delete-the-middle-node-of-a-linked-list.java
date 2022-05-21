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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        
        int size = 0;
        ListNode newnode = head;
        while(newnode!=null){
            size++;
            newnode=newnode.next;
        }
        
        int target = size/2;
        int count = 1;
        ListNode prevNode = head;
        ListNode nextNode = head.next;
        while(count!=target){
            count++;
            prevNode = prevNode.next;
            nextNode = nextNode.next;
        }
        prevNode.next = nextNode.next;
        nextNode.next = null;
        
        return head;
        
    }
}