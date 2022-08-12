class Solution {
    
    public static boolean isPalindrome(String str ){
        int start = 0;
        int end = str.length()-1;
        
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    
    public static void solve(String s , int index , List<String> temp , List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=index ; i<s.length() ; ++i){
            if(isPalindrome(s.substring(index , i+1))){
                temp.add(s.substring(index , i+1));
                solve(s , i+1 , temp , ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        
        solve(s , 0 , temp , ans);
        
        return ans;
    }
}