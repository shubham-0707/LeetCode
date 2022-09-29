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
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode newnode = head;
        
        while(newnode!=null){
            arr.add(newnode.val);
            newnode = newnode.next;
        }
        
        // for(int i=0 ; i<arr.size() ; i++){
        //     System.out.print(arr.get(i)+" ");
        // }
        
        int start = 0;
        int end = arr.size()-1;
        boolean flag = true;
        newnode = head;
        while(start<=end){
            if(flag == true){
                newnode.val = arr.get(start);
                flag = false;
                start++;
            }
            else{
                newnode.val = arr.get(end);
                flag = true;
                end--;
            }
            newnode = newnode.next;
        }
        
    }
}