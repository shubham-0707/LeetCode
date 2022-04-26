class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        
        int start=0;
        int end = citations.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(citations[mid]==citations.length-mid){
                return citations[mid];
            }
            else if(citations[mid]<citations.length-mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return citations.length-start;
    }
}