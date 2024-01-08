public class CountNumberOfOccurrences extends FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3, 10, 10, 10 , 18 ,20};
        int firstOccurrence = firstOccurrence(arr, 10);
        int lastOccurrence = lastOccurrence(arr, 10);
        System.out.println("Count is: "+(lastOccurrence-firstOccurrence+1));
    }
}
