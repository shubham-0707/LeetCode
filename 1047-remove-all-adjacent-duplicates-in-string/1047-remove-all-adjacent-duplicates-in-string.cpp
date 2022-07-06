class Solution {
public:
    string removeDuplicates(string s) {
        vector<char> res = {' '};
        res.push_back(s[0]);
        for(int i=1 ; i<s.length() ; i++){
            if(res[res.size()-1]==s[i]){
                res.pop_back();
            }
            else{
                res.push_back(s[i]);
            }
        }
        string str = "";
        for(int i=0 ; i<res.size() ; i++){
            if(res[i]==' '){
                continue;
            }
            else{
                str+=res[i];
            }
        }
        return str;
    }
};