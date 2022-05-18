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
    public ListNode sortList(ListNode head) {
        ListNode newnode = head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(newnode!=null){
            arr.add(newnode.val);
            newnode=newnode.next;
        }
        
        Collections.sort(arr);
        
        newnode= head;
        int i=0;
        while(newnode!=null){
            newnode.val = arr.get(i);
            newnode=newnode.next;
            i++;
        }
        
        return head;
        
    }
}