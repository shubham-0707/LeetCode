public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2 , 4, 10 , 10 , 10 , 18, 20};
        int[] ans = new int[2];
        ans[0] = firstOccurrence(arr, 10);
        ans[1] = lastOccurrence(arr, 10);
        System.out.println("First Occurence : " + ans[0]+"\nLast Occurence : " + ans[1]);
    }

    protected static int firstOccurrence(int[] arr, int target){
        int start = 0;
        int last = arr.length-1;

        while(start<=last){
            int mid = start + (last-start)/2;
            if(arr[mid]==target && (mid==0 || arr[mid-1]!=target)) return mid;
            else if(target<=arr[mid]) last = mid-1;
            else start = mid+1;
        }
        return -1;
    }

    protected static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int last = arr.length-1;
        while(start<=last){
            int mid = start + (last-start)/2;
            if(arr[mid]==target && (mid==arr.length-1 || arr[mid+1]!=arr[mid])) return mid;
            else if(target<arr[mid]) last = mid-1;
            else start = mid+1;
        }
        return -1;
    }
}
