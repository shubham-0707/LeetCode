class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int multiple = 1;
        int size = word.length();
        while(size>0){
            if(size<=8){
                ans = ans + size*multiple;
                break;
            } else {
                ans = ans + 8*multiple;
            }
            size = size-8;
            multiple++;
        }
        return ans;
    }
}