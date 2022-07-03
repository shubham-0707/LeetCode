// { Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.oddEven(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static String oddEven(String S) {
        // code here...
     char[] chr = S.toCharArray();
     HashMap<Character , Integer> hash = new HashMap<>();
      for(int i=0 ; i<chr.length ; i++){
        hash.put(chr[i] , hash.getOrDefault(chr[i] , 0)+1);
      }
      int X = 0;
      int Y = 0;
      
      for(int i=0 ; i<chr.length ; i++){
          if((chr[i]-96)%2==0 && hash.get(chr[i])%2==0){
              X+=1;
              hash.put(chr[i] , 1);
          }
          else if((chr[i]-96)%2==1 && hash.get(chr[i])%2==1){
              Y+=1;
              hash.put(chr[i] , 0);
          }
      }

      if((X+Y)%2==0){
        return "EVEN";
      }
      return "ODD";
    }
}