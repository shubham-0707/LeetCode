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
        Stack<Integer> st = new Stack<Integer>();
        
        ListNode newnode = head;
        while(newnode!=null){
            st.push(newnode.val);
            newnode=newnode.next;
        }
        
        newnode = head;
        while(newnode!=null){
            if(st.pop()!=newnode.val){
                return false;
            }
            newnode=newnode.next;
        }
        return true;
    }
}