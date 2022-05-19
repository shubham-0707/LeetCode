// { Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
        String ans = "";
    int count = 0;
  for(int i=0 ; i<str.length() ; i=i+count){
      count = 1;
      int j=i;
      while(j+1<str.length() && str.charAt(j)==str.charAt(j+1)){
          count++;
          j++;
      }
      ans = ans + str.charAt(i) + "" + count;
      
  } 
   return ans; 
	}
	
 }