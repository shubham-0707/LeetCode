class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    int c = nums[k];
                    int d = nums[l];
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    List<Integer> arr = new ArrayList<Integer>();
                    if(sum==target){
                        
                            arr.add(nums[i]);
                            arr.add(nums[j]);
                            arr.add(nums[k]);
                            arr.add(nums[l]);
                            ans.add(arr);
                        
                        while(k<l && nums[k]==c) k++;
                        while(k<l && nums[l]==d) l--;
                        
                    }
                    
                    else if(sum<target){
                        k++;
                        while(k<l && nums[k]==c) k++;
                    }
                    else{
                        l--;
                        while(k<l && nums[l]==d) l--;
                    }
                }
                while(j<nums.length-2 && nums[j]==nums[j+1]) j++;
            }
            while(i<nums.length-1 && nums[i]==nums[i+1]) i++;
        }
        return ans;
    }
}