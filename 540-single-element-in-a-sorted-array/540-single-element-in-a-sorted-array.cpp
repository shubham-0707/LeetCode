class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int n = nums.size();
        if(nums.size()==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        else if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        
        else{
            int start = 0;
            int end = n-1;
            
            while(start<=end){
                int mid = start + (end-start)/2;
                if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                    return nums[mid];
                }
                else if(nums[mid]==nums[mid-1]){
                    if(mid%2==0){
                        end = mid;
                    }
                    else{
                         start=mid+1;
                    }
                }
                else if(nums[mid]==nums[mid+1]){
                    if(mid%2==0){
                        start=mid+2;
                    }
                    else{
                        end=mid-1;
                    }
                }   
            }
        }
        return -1;
    }
};