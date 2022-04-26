class Solution {
public:
    int hIndex(vector<int>& citations) {
        sort(citations.begin() , citations.end());
        
        int start = 0;
        int end = citations.size()-1;
        
        while(start<=end){
            
            int mid = end + (start-end)/2;
            
            if(citations[mid]==citations.size()-mid){
                return citations[mid];
            }
            else if(citations[mid]<citations.size()-mid){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return citations.size()-start;
    }
};