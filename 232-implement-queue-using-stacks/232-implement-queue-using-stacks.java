class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void recursion(Stack<Integer> input , Stack<Integer> output){
        if(input.isEmpty())return;
        
        output.push(input.pop());
        recursion(input , output);
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        recursion(input , output);
        int temp = output.pop();
        recursion(output , input);
        return temp;
    }
    
    public int peek() {
        recursion(input , output);
        int temp = output.peek();
        recursion(output , input);
        return temp;
    }
    
    public boolean empty() {
        return input.isEmpty();
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