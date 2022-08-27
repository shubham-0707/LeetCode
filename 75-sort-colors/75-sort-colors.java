class Solution {
    public void sortColors(int[] nums) {
        
        // using priority queue can solve our problem....
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0 ; i<nums.length ; i++){
            pq.add(nums[i]);
        }
        
        for(int i=0 ; i<nums.length ; i++){
            nums[i] = pq.poll();
        }
        
        // Time Complexity : O(n*log(n))
        // Space Complexity : O(n)
        
    }
}