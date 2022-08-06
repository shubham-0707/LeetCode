class Solution {
    public int numIdenticalPairs(int[] nums) {
    // There can be many approaches to solve this question..
        /*
        Approach 1 : if any number appers more than once then calculate its count(Combination)2 and it to sum...
        
        But this would go in O(n square)
        
        */
        
        /*
        Approach 2: 
        
        -> Store count in  a hash table
        -> then use n*(n-1)//2
        -> return the sum 
        
        */
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        int sum = 0;
        for(int i:hash.keySet()){
            int a = hash.get(i);
            int m = a*(a-1);
            sum+=(m-m%2)/2;
        }
        return sum;
    }
}