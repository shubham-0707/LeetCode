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
    public static void reverseArr(int[] arr , int left , int right){
        int start=left-1;
        int end = right-1;
        
        for(int i=start ; start<=end ; start++ , end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode newnode = head;
        int size = 0;
        while(newnode!=null){
            size++;
            newnode=newnode.next;
        }
        newnode = head;
        int arr[] = new int[size];
        int k=0;
        while(newnode!=null){
            arr[k] = newnode.val;
            k++;
            newnode=newnode.next;
        }
        
        reverseArr(arr , left , right);
        
        newnode = head;
        int i=0;
        while(newnode!=null){
            newnode.val = arr[i];
            newnode = newnode.next;
            i++;
        }
        
        return head;
        
    }
}