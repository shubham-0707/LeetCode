public class FindInNearlySorted {
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 40};
        int ans = findInNearlySortedArray(arr, 30);
        if(ans==-1) System.out.println("Sorry !, the element is not there");
        else System.out.println("the index is : "+ans);
    }

    public static int findInNearlySortedArray(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]==target) return mid;
            else if(mid-1>=start && arr[mid-1]==target) return mid-1;
            else if(mid+1>=end && arr[mid+1]==target) return mid+1;

            else if(arr[mid]<target) start = mid+2;
            else if(arr[mid]>target) end = mid-2;
        }
        return -1;
    }
}
