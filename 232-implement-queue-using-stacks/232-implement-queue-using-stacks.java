class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }
    
    public int peek() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */