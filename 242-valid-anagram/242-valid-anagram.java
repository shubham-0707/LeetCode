class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[27];
        for(int i=0 ; i<s.length() ; i++){
            arr1[s.charAt(i)-97]++;
        }
        
        int[] arr2 = new int[27];
        for(int i=0 ; i<t.length() ; i++){
            arr2[t.charAt(i)-97]++;
        }
        
        for(int i=0 ; i<27 ; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}