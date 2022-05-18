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
        ListNode newnode = head;
        int size=0;
        while(newnode!=null){
            size++;
            newnode=newnode.next;
        }
        int count = 0;
        newnode = head;
        while(newnode!=null){
            if(count==(size/2)){
                break;
            }
            count++;
            newnode=newnode.next;
        }
        return newnode;
    }
}