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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        ListNode newnode = l1;
        while(newnode!=null){
            arr.add(newnode.val);
            newnode=newnode.next;
        }
        Collections.reverse(arr);
        newnode = l1;
        for(int i=0 ; i<arr.size() ; i++){
            newnode.val = arr.get(i);
            newnode = newnode.next;
        }
        
        arr.clear();
        
        newnode = l2;
        while(newnode!=null){
            arr.add(newnode.val);
            newnode = newnode.next;
        }
        Collections.reverse(arr);
        
        newnode = l2;
        for(int i=0 ; i<arr.size() ; i++){
            newnode.val = arr.get(i);
            newnode = newnode.next;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry==1){
            int sum = 0;
            
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            
            sum = sum+carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        arr.clear();
        newnode = dummy.next;
        while(newnode!=null){
            arr.add(newnode.val);
            newnode=newnode.next;
        }
        Collections.reverse(arr);
        newnode = dummy.next;
        for(int i=0 ; i<arr.size() ; i++){
            newnode.val = arr.get(i);
            newnode = newnode.next;
        }
        return dummy.next;
    }
}