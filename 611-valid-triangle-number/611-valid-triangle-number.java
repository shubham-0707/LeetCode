class Solution {
    public int triangleNumber(int[] arr) {
        // Approach 1 : Use 3 loops but that will be O(n cube)...
        
        //Approach 2 : Use 2 loops and scan linearly...
        
        int count = 0;
        Arrays.sort(arr);
        for(int i=0 ; i<arr.length-2 ; i++){
            int k = i+2;
            for(int j=i+1 ; j<arr.length-1&&arr[i]!=0 ; j++){
                while(k<arr.length && arr[i]+arr[j]>arr[k]){
                    k++;
                }
                count+=(k-j-1);
            }
        }
        return count;
    }
}