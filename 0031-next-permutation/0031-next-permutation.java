class Solution {
    public void reverse(int[] nums , int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int point1 = -1;

        for(int i=nums.length-1 ; i>=1 ; i--){
            if(nums[i-1]<nums[i]){
                point1 = i-1;
                break;
            }
        }
        int point2 = nums.length-1;
        for(int i=nums.length-1 ; i>=0 ; i--){
            if(point1!=-1 && nums[point1]<nums[i]){
                point2 = i;
                break;
            }
        }

        if(point1!=-1){
            int temp = nums[point1];
            nums[point1] = nums[point2];
            nums[point2] = temp;
        }
        

        reverse(nums , point1+1 , nums.length-1);

    }
}