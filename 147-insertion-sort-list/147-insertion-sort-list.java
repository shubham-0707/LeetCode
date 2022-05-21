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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        ListNode newnode = head;
        while(newnode!=null){
            arr.add(newnode.val);
            newnode=newnode.next;
        }
        Collections.sort(arr);
        
        int k=0;
        newnode = head;
        while(newnode!=null){
            newnode.val = arr.get(k);
            k++;
            newnode=newnode.next;
        }
        return head;
    }
}