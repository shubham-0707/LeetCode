class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        long mid = start + (end-start)/2;
        while(start<=end){
            long Sn = (mid)*(mid+1)/2;
            if(Sn+mid+1==n){
                return (int)(mid+1);
            }
            else if(Sn+mid+1<n){
                start=mid+1;
            }
            else if(Sn+mid+1>n){
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return (int)(mid);
    }
}