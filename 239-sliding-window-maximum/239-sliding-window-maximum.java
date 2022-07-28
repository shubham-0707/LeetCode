class MonotonicQueue{
    private LinkedList<Integer> q;
    
    public MonotonicQueue(){
        q= new LinkedList<Integer>();
    }
    
    public void push(int n){
        while(!q.isEmpty() && q.getLast()<n){
            q.pollLast();
        }
        q.addLast(n);
    }
    
    public int getMax(){
        return q.getFirst();
    } 
    
    public void pop(int n){
        if(n==q.getFirst()){
            q.pollFirst();
        }
    }
}

class Solution {
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int[] result = new int[n-k+1];
        int index = 0;
        
        MonotonicQueue q = new MonotonicQueue();
        
        for(int i=0 ; i<n; i++){
            if(i<k-1){
                q.push(nums[i]);
            }
            else{
                q.push(nums[i]);
                result[index++] = q.getMax();
                q.pop(nums[i-k+1]);
            }
        }
        return result;
    }
}