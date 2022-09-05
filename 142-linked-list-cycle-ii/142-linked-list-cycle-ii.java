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
            if(!hash.containsKey(curr)){
                hash.put(curr , 1);
            }
            else{
                return curr;
            }
            
            curr = curr.next;
        }
        
        return null;
    }
}