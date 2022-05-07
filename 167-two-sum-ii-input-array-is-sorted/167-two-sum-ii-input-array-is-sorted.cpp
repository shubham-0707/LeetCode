class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
    vector<int> v;
    int n = numbers.size()-1;
    for(int i=0 ; i<numbers.size(); i++){
        int key = target - numbers[i];
        int start=i+1;
        int end = n;
        int idx = 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                idx = mid;
                break;
            }
            else if(numbers[mid]<key){
                start=mid+1;
            }
            else if(numbers[mid]>key){
                end=mid-1;
            }
        }
        if(numbers[i]+numbers[idx]==target){
            v.push_back(i+1);
            v.push_back(idx+1);
            break;
        }
    }
        return v;
    }
};