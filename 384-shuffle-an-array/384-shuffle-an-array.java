class Solution {
    int[] temp;
    int[] reset;
    Random rnd = new Random();
    public Solution(int[] nums) {
        temp = new int[nums.length];
        reset = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            temp[i] = nums[i];
            reset[i] = nums[i];
        }
    }
    
    public int[] reset() {
        return reset;
    }
    
    public int[] shuffle() {
        int low = 0;
        
        while(low<temp.length){
            int r = rnd.nextInt(temp.length);
            int tempi = temp[r];
            temp[r] = temp[low];
            temp[low] = tempi;
            low++;
        }
        return temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */