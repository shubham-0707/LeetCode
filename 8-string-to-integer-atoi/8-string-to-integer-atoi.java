class Solution {
    boolean flag_neg = false;
    boolean flag_pos = false;
    int x = -1;
    public long Atoi(String s , long prod){
        x++;
        if(s.length()==0){
            return prod;
        }
        
        
        if(((int)s.charAt(0)>=97 && (int)s.charAt(0)<=122)|| s.charAt(0)=='.') return prod;
        
    
        if(s.charAt(0)=='-'){
            if(x!=0) return prod;
            flag_neg=true;
            //if(flag_pos==true && flag_neg==true) return prod;
            return Atoi(s.substring(1) , prod);
        }
        
        if(s.charAt(0)=='+'){
            if(x!=0) return prod;
            flag_pos=true;
            //if(flag_pos==true && flag_neg==true) return prod;
            return Atoi(s.substring(1) , prod);
        }
        
        if(s.charAt(0)==' '){
            if(x!=0) return prod;
            return Atoi(s.substring(1) , prod);
        } 
            
            
        
        prod = prod*10 + (s.charAt(0) - '0');
        if(prod>Integer.MAX_VALUE) return prod;
        //System.out.print(prod+" ");
        
        return Atoi(s.substring(1) , prod);
        
    }
    
    public int myAtoi(String s) {
        
        s = s.toLowerCase();
        s = s.trim();
        
        long ans = Atoi(s , 0);
        
  if(flag_neg==true && ans>Integer.MAX_VALUE) return Integer.MIN_VALUE;
  else if(flag_neg==false && ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;    
        
        if(flag_neg==true) return (-1)*(int)ans;
        return (int)ans;
    }
}