class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        int k = 0;
        int mini = 0;
        
        
        
        for(int i=0 ; i<nums.length ; i++){
            
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int j=0 ; j<nums.length ; j++){
                 if(nums[j]>0){
                temp.add(nums[j]);
                }
            }
            
           
            
            Collections.sort(temp);
        
            
            if(temp.size()>0){
                mini = temp.get(0);
            
                //System.out.println(mini);
            
                count++;
            }
            
            
            
            for(int j=0 ; j<nums.length ; j++){
                if(nums[j]>0){
                    nums[j]=nums[j]-mini;
                }
            }
            
            
        }
        
        return count;
        
        
    }
}