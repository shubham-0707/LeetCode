class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]%2==0){
                arr.add(0 , nums[i]);
            }
            else{
                arr.add(nums[i]);
            }
        }
        
        int[] ans = arr.stream().mapToInt(i -> i).toArray();
        
        return ans;
    }
}