class Solution {
private:
    void letterCombination(string digits , vector<string> nums , string s , int i , vector<string>& res){
        if(i==digits.length()){
            res.push_back(s);
            return;
        }
        
        string val = nums[digits[i] - '0'];
        for(int j=0 ; j<val.length() ; j++){
            letterCombination(digits , nums , s+val[j] , i+1 , res);
        }
    }
public:
    vector<string> letterCombinations(string digits) {
        vector<string> nums = {"" ,"" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        vector<string> res;
        if(digits.length()==0){
            return res;
        }
        int i = 0;
        string s;
        letterCombination(digits , nums , s , i , res);
        return res;
    }
};