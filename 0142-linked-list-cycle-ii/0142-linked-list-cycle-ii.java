/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode , Integer> hash = new HashMap<>();
        
        
        ListNode curr = head;
        while(curr!=null){
            hash.put(curr , hash.getOrDefault(curr , 0)+1);
            
            if(hash.get(curr)==2) return curr;
            curr = curr.next;
        }
        
        return null;
    }
}