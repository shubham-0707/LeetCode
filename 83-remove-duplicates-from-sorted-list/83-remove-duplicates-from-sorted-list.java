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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode currnode = head;
        ListNode nextnode = head.next;
        
        
        while(nextnode!=null){
            if(currnode.val == nextnode.val){ 
                if(nextnode.next==null){
                    currnode.next=null;
                }
                nextnode = nextnode.next;
            }
            else{
                currnode.next = nextnode;
                currnode=nextnode;
                nextnode = nextnode.next;
            }
        }
        return head;
    }
}