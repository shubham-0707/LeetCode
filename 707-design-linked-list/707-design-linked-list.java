class Node{
    Node next;
    int val;
    
    Node(int val){
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {
    
    Node head;
    int size;
    
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        int count = 0;
        Node temp = head;
        
        while(count<index){
            count++;
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    
    public void addAtTail(int val) {
        int count = 0;
        Node temp = new Node(val);
        if(size==0){
            addAtHead(val);
            return;
        }
        Node newnode = head;
        while(count<size-1){
            count++;
            newnode = newnode.next;
        }
        newnode.next = temp;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        else{
            if(index==0){
                addAtHead(val);
                return;
            }
            else{
                Node temp = new Node(val);
                int count = 0;
                Node newnode = head;
                
                while(count<index-1){
                    count++;
                    newnode=newnode.next;
                }
                
                temp.next= newnode.next;
                newnode.next = temp;
                size++;
            }
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index>=0 && index<size){
            if(index==0){
                head = head.next;
                size--;
            }
            else{
                int count = 0;
                Node temp = head;
                while(count<index-1){
                    count++;
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */