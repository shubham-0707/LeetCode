class Node{
    int key;
    int val;
    Node next;
    
    Node(int key , int val){
        this.key = key;
        this.val = val;
        this.next = null;
    }
}



class MyHashMap {
    Node head;
    public MyHashMap() {
        head = null;
    }
    
    public void put(int key, int value) {
        Node newnode = head;
        Node temp = new Node(key , value);
        if(newnode==null){
            head = temp;
            return;
        }
        else{
            boolean flag = false;
            while(newnode!=null){
                if(newnode.key == key){
                    newnode.val = value;
                    flag = true;
                    break;
                }
                newnode = newnode.next;
            }
            if(flag==false){
                temp.next = head;
                head = temp;
            }
        }
    }
    
    public int get(int key) {
        int ans = -1;
        
        Node newnode = head;
        
        while(newnode!=null){
            if(newnode.key == key){
                return newnode.val;
            }
            newnode = newnode.next;
        }
        
        return -1;
    }
    
    public void remove(int key) {
        if(head==null) return;
        else if(head.key == key){
            head = head.next;
        }
        else{
            Node temp = head;
            Node curr = head.next;
            
            while(curr!=null && curr.key!=key){
                temp = temp.next;
                curr = curr.next;
            }
            
            if(curr!=null && curr.key==key){
                temp.next = temp.next.next;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */