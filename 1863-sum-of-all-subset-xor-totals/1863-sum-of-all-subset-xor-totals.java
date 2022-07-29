class Solution {
    public int subsetXORSum(int[] nums) {
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        for(int i=0 ; i<(1<<nums.length) ; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0 ; j<nums.length ;j++){
                if((i&(1<<j))>0){
                    temp.add(nums[j]);
                }
            }
            arr.add(temp);
        }
        
        
        int sum = 0;
        for(int i=0 ; i<arr.size() ; i++){
            int xor = 0;
            for(int j=0 ; j<arr.get(i).size() ; j++){
                xor = xor ^ arr.get(i).get(j);
            }
            sum+=xor;
        }
        return sum;
    }
}