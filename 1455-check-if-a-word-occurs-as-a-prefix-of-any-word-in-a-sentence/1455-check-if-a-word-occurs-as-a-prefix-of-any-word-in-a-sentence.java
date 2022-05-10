class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");
        
        int index = -1;
        
        for(int i=0 ; i<str.length ; i++){
            if(str[i].length()>=searchWord.length()){
                String temp = "";
                for(int j=0 ; j<searchWord.length() ; j++){
                    temp+=str[i].charAt(j);
                }
                if(temp.equals(searchWord)){
                    return i+1;
                }
            }
        }
        return index;
    }
}