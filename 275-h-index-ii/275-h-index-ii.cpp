class Solution {
public:
    int hIndex(vector<int>& citations) {
        int start = 0;
        int end = citations.size()-1;
        
        while(start<=end){
            
            int mid = start+(end-start)/2;
            
            if(citations[mid]==citations.size()-mid){
                return citations[mid];
            }
            else if(citations[mid]<citations.size()-mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return citations.size()-start;
    }
};