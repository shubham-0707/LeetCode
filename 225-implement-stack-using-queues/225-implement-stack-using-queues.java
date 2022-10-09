class MyStack {
    
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void backtrack(Queue<Integer> queue1  , Queue<Integer> queue2){
        if(queue1.isEmpty())return;
        
        int temp = queue1.poll();
        backtrack(queue1 , queue2);
        queue2.add(temp);
    }
    
    public void push(int x) {
        queue1.add(x);
    }
    
    public int pop() {
        
        backtrack(queue1 , queue2);
        int temp = queue2.poll();
        backtrack(queue2 , queue1);
        return temp;
        
    }
    
    public int top() {
        backtrack(queue1 , queue2);
        int temp = queue2.peek();
        backtrack(queue2 , queue1);
        return temp;
    }
    
    public boolean empty() {
        return queue1.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */