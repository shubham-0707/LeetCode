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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newnode = head;
        int size = 0;
        while(newnode!=null){
            size++;
            newnode=newnode.next;
        }
        
        newnode = head;
        int count = 1;
        int target = size - k +1;
        while(count!=k){
            count++;
            newnode=newnode.next;
        }
        count = 1;
        ListNode targetNode = head;
        while(count!=target){
            count++;
            targetNode = targetNode.next;
        }
        
        int temp = targetNode.val;
        targetNode.val = newnode.val;
        newnode.val = temp;
        
        
        return head;
        
    }
}