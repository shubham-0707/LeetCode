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
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        ListNode newnode = head;
        while(newnode!=null){
            arr.add(newnode.val);
            newnode=newnode.next;
        }
        
        head = null;
        
        for(int i=0 ; i<arr.size() ; i++){
            if(arr.get(i)==val){
                continue;
            }
            else{
                if(head!=null){
                    newnode = new ListNode(arr.get(i));
                    ListNode temp = head;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next = newnode;
                    newnode.next = null;
                }
                else if(head==null){
                    newnode = new ListNode(arr.get(i));
                    newnode.next = null;
                    head = newnode;
                }
            }
        }
        return head;
    }
}