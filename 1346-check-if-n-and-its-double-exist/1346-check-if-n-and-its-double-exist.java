class Solution {
    public static int binary_search(int[] arr , int key , int i){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return i;
    }
    public boolean checkIfExist(int[] arr) {
        boolean flag = false;
        Arrays.sort(arr);
        for(int i=0 ; i<arr.length ; i++){
            int a = binary_search(arr , 2*arr[i] , i);
            if(a!=i){
                flag=true;
                break;
            }
        }
        return flag;
    }
}