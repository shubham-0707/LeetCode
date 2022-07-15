// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean rotated(String str1 , String str2){
        char[] ch = str1.toCharArray();
        
        for(int i=0 ; i<2 ; i++){
            char ch1 = ch[0];
            for(int j=1 ; j<ch.length ; j++){
                ch[j-1] = ch[j];
            }
            ch[ch.length-1] = ch1;
        }
        
        String temp = new String(ch);
        
        if(temp.equals(str2)){
            return true;
        }
        
        return false;
    }
    
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here...
        if(rotated(str1 , str2) || rotated(str2 , str1)){
            return true;
        }
        
        
        return false;
        
    }
    
}