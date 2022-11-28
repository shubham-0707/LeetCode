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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newnode = head;
        int size = 0;
        while(newnode!=null){
            size++;
            newnode=newnode.next;
        }
        
        int target = size-n+1;
        int count=1;
        
        if(size-n==0){
            return head.next;
        }
        
        newnode = head;
        ListNode secondLast = head;
        ListNode LastNode = head.next;
        while(newnode!=null){
            if(count==target-1){
                secondLast.next = LastNode.next;
                LastNode.next = null;
                break;
            }
            secondLast = LastNode;
            LastNode = LastNode.next;
            count++;
        }
        
        return head;
    }
}