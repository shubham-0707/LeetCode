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
    public ListNode deleteDuplicates(ListNode head) {
        int[] arr = new int[201];
        ListNode newnode = head;
        while(newnode!=null){
            arr[newnode.val+100]++;
            newnode=newnode.next;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0 ; i<201 ; i++){
            if(arr[i]==1){
                list.add(i-100);
            }
        }
        
        if(list.size()==0){
            return null;
        }
        
        newnode = head;
        ListNode temp = null;
        for(int i=0 ; i<list.size() ; i++){
            newnode.val = list.get(i);
            temp = newnode;
            newnode = newnode.next;
        }
        temp.next=null;
        return head;
    }
}