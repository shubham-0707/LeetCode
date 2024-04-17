class Solution {
public:
    bool isOneBitCharacter(vector<int>& bits) {
        int flag ;
        for (int i=0; i<bits.size();){
            if (bits[i] == 0){
                i++ ;
                flag = 0 ;
            }
            else if (bits[i] == 1){
                i += 2 ;
                flag = 1 ;
            }
        }
        if (!flag) return true ;
        return false ;
    }
};