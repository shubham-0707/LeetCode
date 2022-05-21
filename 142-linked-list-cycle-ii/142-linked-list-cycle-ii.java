/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode isCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
    
    public ListNode detectCycle(ListNode head) {
        ListNode run = head;
        ListNode ptr = isCycle(head);
        
        if(ptr==null){
            return null;
        }
        
        while(run!=ptr){
            run = run.next;
            ptr=ptr.next;
        }
        return run;
    }
}