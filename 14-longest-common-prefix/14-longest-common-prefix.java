class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int mini = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i=0 ; i<strs.length ; i++){
            if(strs[i].length()<mini){
                mini = strs[i].length();
                minIndex = i;
            }
        }
        
        String test = strs[minIndex];
        String ans = "";
        for(int i=0 ; i<test.length() ; i++){
            for(int j=0 ; j<strs.length ; j++){
                if(test.charAt(i)!=strs[j].charAt(i)){
                    return ans;
                }
            }
            ans+=test.charAt(i);
        }
        return ans;
    }
}