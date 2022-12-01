class Solution {
    
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
    
    
    public boolean isAlike(char[] ch){
        
        int firstHalf=0;
        int secondHalf=0;
        
        for(int i=0 ; i<ch.length/2 ; i++){
            if(isVowel(ch[i]))firstHalf++;
        }
        for(int i=ch.length/2 ; i<ch.length ; i++){
            if(isVowel(ch[i]))secondHalf++;
        }
        
        return firstHalf==secondHalf;
    }
    
    public boolean halvesAreAlike(String s) {
        char[] ch = s.toCharArray();
        
        return isAlike(ch);
    }
}