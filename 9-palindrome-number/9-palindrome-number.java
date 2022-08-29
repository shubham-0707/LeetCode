class Solution {
    public boolean isPalindrome(int x) {
        
        
        int sum = 0;
        int temp = x;
        
        while(x>0){
            sum = sum*10+x%10;
            x/=10;
        }
        
        if(temp<0 || temp!=sum) return false;
        
        return true;
        
    }
}