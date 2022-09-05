class Solution {
    
    public String add(String sums , String curr){
        int carry = 0;
        String ans = "";
        int i = sums.length()-1;
        int j = curr.length()-1;
        
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum = sum + Character.getNumericValue(sums.charAt(i));
            }
            
            if(j>=0){
                sum = sum + Character.getNumericValue(curr.charAt(j));
            }
            
            ans =  (char)(sum%10 + '0') + ans;
            
            carry = sum/10;
            
            i--;
            j--;
        }
        if(carry!=0){
            ans = (char)(carry+'0') + ans;
        }
        
        return ans;
    }
    
    public String multiplyDigit(String str , char ch){
        String ans = "";
        int idx = str.length()-1;
        int carry = 0;
        while(idx>=0){
            int sum = carry + Character.getNumericValue(str.charAt(idx))*Character.getNumericValue(ch);
            
            ans = (char)(sum%10+'0') + ans;
            carry = sum/10;
            idx--;
        }
        if(carry!=0){
            ans = (char)(carry + '0') + ans;
        }
        
        return ans;
    }
    
    public String multiply(String num1, String num2) {
        
        if(num1.charAt(0)=='0' || num2.charAt(0)=='0') return "0";
        
        ArrayList<String> temp_ans = new ArrayList<>();
        int idx = num2.length()-1;
        for(int i=0 ; i<num2.length() ; i++){
            String levelMul = multiplyDigit(num1 , num2.charAt(idx-i));
            for(int j=0 ; j<i ; j++){
                levelMul+='0';
            }
            temp_ans.add(levelMul);
        }
        
        // for(int i=0 ; i<temp_ans.size() ; i++){
        //     System.out.println(temp_ans.get(i)+" ");
        // }
        
        String sum = "0";
        for(int i=0 ; i<temp_ans.size() ; i++){
            sum = add(sum , temp_ans.get(i));
        }
        
        
        return sum;
    }
}