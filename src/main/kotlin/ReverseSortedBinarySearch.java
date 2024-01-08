public class ReverseSortedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5 , 4 , 3 , 2, 1};
        int answer = binarySearch(arr, 3);
        if(answer==-1){
            System.out.println("Sorry the target could not be found");
        } else System.out.println("The answer is: "+answer);
    }

    private static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target) return mid;
            else if(target<arr[mid]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}
