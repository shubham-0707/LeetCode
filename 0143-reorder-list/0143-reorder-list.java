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
    public void reorderList(ListNode head) {
        
        ListNode curr = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(curr!=null){
            arr.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        int start = 0;
        int end = arr.size()-1;
        boolean flag = true;
        
        while(start<=end){
            if(flag){
                curr.val = arr.get(start);
                start++;
                flag = false;
            }
            else{
                curr.val = arr.get(end);
                end--;
                flag = true;
            }
            curr = curr.next;
        }
        
        
        
    }
}