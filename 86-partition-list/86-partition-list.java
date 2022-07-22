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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        ListNode newnode= head;
        
        while(newnode!=null){
            if(newnode.val<x){
                arr1.add(newnode.val);
            }
            else{
                arr2.add(newnode.val);
            }
            newnode=newnode.next;
        }
        
        newnode=head;
        for(int i=0 ; i<arr1.size(); i++){
            newnode.val=arr1.get(i);
            newnode=newnode.next;
        }
        
        for(int i=0 ; i<arr2.size() ; i++){
            newnode.val = arr2.get(i);
            newnode=newnode.next;
        }
        return head;
    }
}