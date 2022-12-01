class Solution {
public:
    bool checkInclusion(string s1, string s2) {
    sort(s1.begin() , s1.end());
    int n = s2.length();
    int m = s1.length();

    for(int i=0 ; i<=n-m ; i++){
        string s3 = s2.substr(i, m);
        sort(s3.begin() , s3.end());
        if(s3==s1){
            return true;
        }
    }
        return false;
    }
};