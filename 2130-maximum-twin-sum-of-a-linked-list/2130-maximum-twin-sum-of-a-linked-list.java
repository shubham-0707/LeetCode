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
    public int pairSum(ListNode head) {
        ListNode prevNode = head;
        
        
        int size = 0;
        while(prevNode!=null){
            size++;
            prevNode = prevNode.next;
        }
        
        int target = size/2;
        int count = 1;
        prevNode=head;
        ListNode nextNode = head.next;
        while(count!=target){
            prevNode = nextNode;
            nextNode = nextNode.next;
            count++;
        }
        
        ListNode temp1 = nextNode;
        ListNode temp2 = nextNode.next;
        
        
        
        while(temp2!=null){
            ListNode temp3 = temp2.next;
            temp2.next = temp1;
            
            temp1 = temp2;
            temp2 = temp3;
        }
        
        nextNode.next=null;
        prevNode.next=temp1;
        
        target = target+1;
        count = 1;
        nextNode = head;
        prevNode = head;
        int maxi = -100;
        while(count!=target){
            count++;
            nextNode = nextNode.next;
        }
        
        while(nextNode!=null){
            maxi = Math.max(maxi , prevNode.val+nextNode.val);
            prevNode=prevNode.next;
            nextNode = nextNode.next;
        }
        
        return maxi;
    }
}