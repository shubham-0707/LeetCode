class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        int maxi = -1;
        int maxIndex = -1;
        int n = arr.size();
        for(int i=0 ; i<n ; i++){
            if(arr[i]>maxi){
                maxi = arr[i];
                maxIndex = i;
            }
        }
        
        if(maxIndex==n-1 || maxIndex==0){
            return false;
        }
        for(int i =0 ; i<maxIndex ; i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        
        for(int i=maxIndex ; i<n-1 ; i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        
        if(n>=3){
            return true;
        }
        else{
            return false;
        }
    }
};