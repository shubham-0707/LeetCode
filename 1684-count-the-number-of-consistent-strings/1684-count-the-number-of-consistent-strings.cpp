class Solution {
private:
    string removeDuplicatesFromString(string str)
{
 
    // keeps track of visited characters
    int counter = 0;
 
    int i = 0;
    int size = str.size();
 
    // gets character value
    int x;
 
    // keeps track of length of resultant string
    int length = 0;
 
    while (i < size) {
        x = str[i] - 97;
 
        // check if Xth bit of counter is unset
        if ((counter & (1 << x)) == 0) {
 
            str[length] = 'a' + x;
 
            // mark current character as visited
            counter = counter | (1 << x);
 
            length++;
        }
        i++;
    }
 
    return str.substr(0, length);
}
    
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        
        vector<int> ch(26 , 0);
        
        for(int i=0 ; i<allowed.size() ; i++){
            ch[allowed[i]-97]++;
        }
        
        int count = 0;
        for(int i=0 ; i<words.size() ; i++){
            
            string str = removeDuplicatesFromString(words[i]);
            
            bool flag = true;
            
            for(int j=0 ; j<str.size() ; j++){
                if(ch[str[j]-97]==0){
                    flag = false;
                    break;
                }
            }
            
            if(flag == true){
                count++;
            }
            
        }
        return count;
    }
};