class Solution {
public:
    int lengthOfLongestSubstring(string s) {
    int n = s.length();
    int maxi = 0;
    for(int i=0 ; i<n ; i++){
        int count = 0;
        vector<int> v(256 , 0);
        for(int j=i ; j<n ; j++){
            if(v[s[j]]<1){
                v[s[j]]++;
                count++;
            }
            else{
                break;
            }
        }
        maxi = max(maxi , count); 
    }
        return maxi;
    }
};