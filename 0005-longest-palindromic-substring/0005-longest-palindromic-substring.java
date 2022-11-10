class Solution {
    int maxi = 1;
    int[] temp = new int[2];
    public void findStartEnd(String s , int l , int r){
        
        while(l>=0 && r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            else{
                break;
            }
        }
        
        if(r-l-1>maxi){
            maxi = r-l-1;
            temp[0] = l+1;
            temp[1] = r-1;
        }
        
    }
    
public String longestPalindrome(String s) {
        
        for(int i=0 ; i<s.length()-1 ; i++){
            findStartEnd(s , i  , i);
        }
        
        for(int i=0 ; i<s.length()-1 ; i++){
            findStartEnd(s , i , i+1);
        }
        
        return s.substring(temp[0] , temp[1]+1);
    }
}