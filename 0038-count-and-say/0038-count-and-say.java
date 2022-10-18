class Solution {
    
    public String helper(String test){
        
        String tempi = "";
        
        while(test.length()!=0){
            int count = 1;
            char x = test.charAt(0);
            for(int i=1 ; i<test.length() ; i++){
                if(test.charAt(i)!=x){
                    break;
                }
                else{
                    count++;
                }
            }
            tempi = tempi + Integer.toString(count) + x;
            test = test.substring(count);
        }
        
        return tempi;
    }
    
    public String countAndSay(int n) {
        
        if(n==1) return "1";
        String test = "1";
        for(int i=1 ; i<=n-1 ; i++){
            test = helper(test);
        }
        return test;
    }
}