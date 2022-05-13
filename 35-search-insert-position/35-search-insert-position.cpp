class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        nums.push_back(target);
        sort(nums.begin()  , nums.end());
        vector<int>::iterator it ;
        it = find(nums.begin() , nums.end() , target);
        int x = it-nums.begin();
        return x;
    }
};