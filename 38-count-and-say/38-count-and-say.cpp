class Solution {
private:
    string recur(string str){
    string s="";
    int count = 0;
    for(int i=0 ; i<str.length(); i=i+count){
        count = 1;
        int j=i;
        while(str[j]==str[j+1]){
            count++;
            if(j==str.length()-1){
                break;
            }
            j++;
        }
        s=s+to_string(count)+str[i];
    }
        return s;
    }
    
    string CountAndSay(int n){
        string str = "1";
        if(n==1){
            return str;
        }
        else{
            for(int i=2 ; i<=n ; i++){
                str = recur(str);
            }
        }
        
        return str;
    }
public:
    string countAndSay(int n) {
        string ans = CountAndSay(n);
        return ans;
    }
};