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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        
        ListNode newnode = head ;
        int count = 1;
        while(newnode!=null){
            if(count%2==1){
                odd.add(newnode.val);
                count++;
            }
            else if(count%2==0){
                even.add(newnode.val);
                count++;
            }
            newnode=newnode.next;
        }
        
        head = null;
        int countEven = 0;
        int countOdd = 0;
        while(countOdd<odd.size()){
            if(head!=null){
                newnode = new ListNode(odd.get(countOdd++));
                ListNode temp = head;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = newnode;
                newnode.next = null;
            }
            else{
                newnode = new ListNode(odd.get(countOdd++));
                newnode.next = null;
                head = newnode;
            }
        }
        
        while(countEven<even.size()){
            if(head!=null){
                newnode = new ListNode(even.get(countEven++));
                ListNode temp = head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next = newnode;
                newnode.next = null;
            }
            else{
                newnode = new ListNode(even.get(countEven++));
                newnode.next = null;
                head = newnode;
            }
        }
        return head;
    }
}