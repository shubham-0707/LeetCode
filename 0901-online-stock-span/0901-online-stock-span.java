class StockSpanner {

    
    Stack<int[]> st;
    
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        
        while(!st.isEmpty() && st.peek()[1]<=price){
            count+=st.pop()[0];
        }
        
        st.push(new int[]{count , price});
        
        return count;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */