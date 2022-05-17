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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> LL = new Stack<>();
        
        ListNode newnode = head;
        while(newnode!=null){
            LL.push(newnode.val);
            newnode=newnode.next;
        }
        
        newnode=head;
        while(newnode!=null){
            if(LL.pop()!=newnode.val){
                return false;
            }
            newnode=newnode.next;
        }
        
        return true;
    }
}