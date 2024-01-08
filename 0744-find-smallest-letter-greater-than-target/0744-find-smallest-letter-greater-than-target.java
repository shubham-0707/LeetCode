class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int ans = findCeilOfCharacters(letters, (int)target);
        if(ans==-1) return letters[0];
        return (char)ans;
    }

    private int findCeilOfCharacters(char[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if((int)arr[mid]>target) {
                ans = (int)arr[mid];
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
}