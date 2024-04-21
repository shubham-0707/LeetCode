class Solution {
public:
    bool isPowerOfTwo(int n) {
        int ans;
      for(int i=0 ; i<31 ; i++){
          ans = pow(2 , i);
          if(ans == n){
              return true;
          }
      }
        return false;
}
};