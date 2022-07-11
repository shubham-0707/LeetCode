// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean isPalindrome(int n){
        int temp = n;
        int sum = 0;
        while(n>0){
            sum = sum*10+n%10;
            n=n/10;
        }
        return sum==temp;
    }
	public static int palinArray(int[] a, int n)
    {
                  //add code here....
        for(int i=0 ; i<n ; i++){
    	    if(isPalindrome(a[i])){
    	        continue;
    	    }
    	    else{
    	        return 0;
    	    }
    	}
    	
    	return 1;
    }
}