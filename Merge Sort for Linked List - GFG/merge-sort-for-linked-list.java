// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here..
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        Node newnode = head;
        while(newnode!=null){
            arr.add(newnode.data);
            newnode = newnode.next;
        }
        
        Collections.sort(arr);
        
        head = null;
        for(int i=0 ; i<arr.size() ; i++){
            if(head!=null){
                newnode= new Node(arr.get(i));
                Node temp = head;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = newnode;
                newnode.next = null;
            }
            else if(head==null){
                newnode = new Node(arr.get(i));
                newnode.next=null;
                head = newnode;
            }
        }
        return head;
    }
}


