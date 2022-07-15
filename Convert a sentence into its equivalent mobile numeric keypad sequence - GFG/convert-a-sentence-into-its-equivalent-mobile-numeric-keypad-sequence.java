// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        // code here...
        
        
        HashMap<Character , String> hash = new HashMap<>();
        
        hash.put('A' , "2");
        hash.put('B' , "22");
        hash.put('C' , "222");
        hash.put('D' , "3");
        hash.put('E' , "33");
        hash.put('F' , "333");
        hash.put('G' , "4");
        hash.put('H' , "44");
        hash.put('I' , "444");
        hash.put('J' , "5");
        hash.put('K' , "55");
        hash.put('L' , "555");
        hash.put('M' , "6");
        hash.put('N' , "66");
        hash.put('O' , "666");
        hash.put('P' , "7");
        hash.put('Q' , "77");
        hash.put('R' , "777");
        hash.put('S' , "7777");
        hash.put('T' , "8");
        hash.put('U' , "88");
        hash.put('V' , "888");
        hash.put('W' , "9");
        hash.put('X' , "99");
        hash.put('Y' , "999");
        hash.put('Z' , "9999");
        hash.put(' ' , "0");
        
        String ans = "";
        for(int i=0 ; i<S.length() ; i++){
            ans+=hash.get(S.charAt(i));
        }
        return ans;
    }
}