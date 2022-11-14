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
        ListNode newnode = head;
        
        while(newnode!=null){
            hash.put(newnode , hash.getOrDefault(newnode , 0)+1);
            
            if(hash.get(newnode)==2) return newnode;
            
            newnode = newnode.next;
        }
        
        return null;
    }
}