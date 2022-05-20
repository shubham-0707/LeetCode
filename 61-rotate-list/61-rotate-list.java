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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode newnode = head;
        while(newnode!=null){
            list.add(newnode.val);
            newnode=newnode.next;
        }
        
        Collections.rotate(list , k);
        newnode = head;
        int i=0;
        while(newnode!=null){
            newnode.val = list.get(i);
            newnode = newnode.next;
            i++;   
        }
        return head;
    }
}