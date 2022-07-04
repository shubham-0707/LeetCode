// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here...
        HashMap<Integer , Integer> hash = new HashMap<>();
        hash.put(0 , -1);
        ArrayList<Integer> ans = new ArrayList<>();
        int currSum=0;
        for(int i=0 ; i<arr.length ; i++){
            currSum+=arr[i];
            if(arr[i]==0){
                ans.add(1);
            }
            else if(hash.containsKey(currSum)){
                int length = i-hash.get(currSum);
                ans.add(length);
            }
            
            hash.put(currSum , hash.getOrDefault(currSum ,i));
        }
        
        int maxi = 0;
        for(int i=0 ; i<ans.size() ; i++){
            maxi = Math.max(maxi , ans.get(i));
        }
        
        return maxi;
    }
}