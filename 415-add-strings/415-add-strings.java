class Solution {
    public String addStrings(String str1, String str2) {
        
        int i = str1.length()-1;
        int j = str2.length()-1;
        
        String ans = "";
        int carry = 0;
        while(i>=0 || j>=0){
           int sum = carry;
            
            if(i>=0){
                sum+=Character.getNumericValue(str1.charAt(i));
            }
            
            if(j>=0){
                sum+=Character.getNumericValue(str2.charAt(j));
            }
            
            int value = sum%10;
            
            char ch = Integer.toString(value).charAt(0);
            
            ans = ch+ans;
            
            carry = sum/10;
            
            i--;
            j--;
            
        }
        if(carry>0)
            ans = Integer.toString(carry).charAt(0) + ans;
            
        return ans;
    }
}