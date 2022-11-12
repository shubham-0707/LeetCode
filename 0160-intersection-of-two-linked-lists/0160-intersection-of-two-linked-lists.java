/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode , Integer> hash1 = new HashMap<>();
        HashMap<ListNode , Integer> hash2 = new HashMap<>();
        
        while(headA!=null){
            hash1.put(headA , 1);
            headA = headA.next;
        }
        
        while(headB!=null){
            if(hash1.containsKey(headB)) return headB;
            hash2.put(headB , 1);
            headB = headB.next;
        }
        
        return null;
    }
}