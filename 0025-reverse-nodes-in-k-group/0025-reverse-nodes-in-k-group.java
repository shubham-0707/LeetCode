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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(curr!=null){
            int count = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            while(count<k && curr!=null){
                arr.add(curr.val);
                curr = curr.next;
                count++;
            }
            if(count==k){
                Collections.reverse(arr);
            }
            
            for(int i=0 ; i<arr.size() ; i++){
                ListNode tempi = new ListNode(arr.get(i));
                temp.next = tempi;
                temp = tempi;
            }
        }
        
        return dummy.next;
    }
}