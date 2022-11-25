class Solution {
    
    public int findSum(int n){
        int sum = 0;
        
        while(n>0){
            int res = n%10;
            sum+=res*res;
            
            n=n/10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        while(true){
            
            int sum = findSum(n);
            
            if(sum==1) return true;
            else if(hash.containsKey(sum)) return false;
            else{
                hash.put(sum , 1);
                n = findSum(sum);
            }
        }

    }
}