class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr = new char[26];
        for(int i=0 ; i<sentence.length() ; i++){
            arr[sentence.charAt(i)-'a']++;
        }
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==0){
                return false;
            }
        }
        
        return true;
    }
}