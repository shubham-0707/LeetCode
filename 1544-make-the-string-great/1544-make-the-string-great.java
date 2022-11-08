class Solution {
    public String makeGood(String s) {
        
        String ans = "";
        
        while(true){
            int index = -1;
            String temp = "";
            for(int j=0 ; j<s.length()-1 ; j++){
                if((int)s.charAt(j)==(int)s.charAt(j+1)-32 || (int)s.charAt(j)-32 == (int)s.charAt(j+1)){
                    index = j;
                    break;
                }
                else{
                    temp = temp + s.charAt(j) + "";
                }
            }
            
            if(index==-1){
                break;
            }
            
            s = temp + s.substring(index+2);
        }
        return s;
    }
}