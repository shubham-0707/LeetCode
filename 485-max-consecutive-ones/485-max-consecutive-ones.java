class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int count=0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==1){
                count++;
            }
            else{
                arr.add(count);
                count=0;
            }
        }
        arr.add(count);
        
        int maxi = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.size() ; i++){
            maxi = Math.max(maxi , arr.get(i));
        }
        return maxi;
    }
}