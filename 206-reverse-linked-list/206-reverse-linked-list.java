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
    public ListNode reverseList(ListNode head) {
        
        if(head==null){
            return head;
        }
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        ListNode newnode = head;
        while(newnode!=null){
            arr.add(newnode.val);
            newnode=newnode.next;
        }
        
        Collections.reverse(arr);
        
        newnode=head;
        int x = 0;
        while(newnode!=null){
            newnode.val = arr.get(x);
            x++;
            newnode=newnode.next;
        }
        return head;
    }
}