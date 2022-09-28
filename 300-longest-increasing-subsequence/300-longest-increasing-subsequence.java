class Solution {
    public int lengthOfLIS(int[] nums) {
        
        
        int maxi = 0;
        ArrayList<Integer> arr = new ArrayList<>();
            arr.add(nums[0]);
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]>arr.get(arr.size()-1)){
                arr.add(nums[i]);
            }
            else{
                int start = 0;
                int end = arr.size()-1;
                int target = nums[i];
                int index = 0;
                while(start<=end){
                    int mid = start + (end-start)/2;
                    
                    if(arr.get(mid)==target){
                        index = mid;
                        break;
                    }
                    else if(arr.get(mid)<target){
                        start = mid+1;
                    }
                    else{
                        index = mid;
                        end = mid-1;
                    }
                }
                
                arr.set(index , target);
            }
        }
        return arr.size();
    }
}