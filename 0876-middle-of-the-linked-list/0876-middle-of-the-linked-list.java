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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode curr = head;
        
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        
        int mid = size/2;
        
        curr = head;
        size = 0;
        while(curr!=null){
            if(size==mid)return curr;
            size++;
            curr = curr.next;
        }
        
        return null;
    }
}