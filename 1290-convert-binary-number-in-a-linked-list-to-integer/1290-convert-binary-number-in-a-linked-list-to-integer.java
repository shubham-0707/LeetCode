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
    public int getDecimalValue(ListNode head) {
        String str = "";
        
        ListNode currNode = head;
        while(currNode!=null){
            str = str+Integer.toString(currNode.val);
            currNode=currNode.next;
        }
        
        return Integer.parseInt(str , 2);
    }
}