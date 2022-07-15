// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here....
        
        HashMap<Character , Integer> hash = new HashMap<>();
        
        hash.put('I' , 1);
        hash.put('V' , 5);
        hash.put('X' , 10);
        hash.put('L' , 50);
        hash.put('C' , 100);
        hash.put('D' , 500);
        hash.put('M' , 1000);
        
        int sum = hash.get(str.charAt(str.length()-1));
        
        for(int i=str.length()-2 ; i>=0 ; i--){
            if(hash.get(str.charAt(i))>=hash.get(str.charAt(i+1))){
                sum+=hash.get(str.charAt(i));
            }
            else{
                sum-=hash.get(str.charAt(i));
            }
        }
        
        return  sum;
    }
}