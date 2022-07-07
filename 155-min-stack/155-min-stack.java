class MinStack {
    
    private Stack<Integer> min;
    private Stack<Integer> prevMin;

    public MinStack() {
        min = new Stack<>();
        prevMin = new Stack<>();
    }
    
    public void push(int val) {
       min.push(val);
        if(!prevMin.isEmpty()){
            prevMin.push(Math.min(val , prevMin.peek()));
        }
        else{
            prevMin.push(val);
        }
    }
    
    public void pop() {
        min.pop();
        prevMin.pop();
    }
    
    public int top() {
        return min.peek();
    }
    
    public int getMin() {
        return prevMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */