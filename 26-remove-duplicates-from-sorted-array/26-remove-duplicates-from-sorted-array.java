class Solution {
    public int removeDuplicates(int[] arr) {
        
        
        int x = 0;
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            if(arr[x]!=arr[i]){
                x++;
                arr[x] = arr[i];
            }
        }
        return x+1;
    }
}