class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character , String> morse = new HashMap<>();
        
        HashMap<String , Integer> hash = new HashMap<>();
        
        morse.put('a' , ".-");
        morse.put('b' , "-...");
        morse.put('c' , "-.-.");
        morse.put('d' , "-..");
        morse.put('e' , ".");
        morse.put('f' , "..-.");
        morse.put('g' , "--.");
        morse.put('h' , "....");
        morse.put('i' , "..");
        morse.put('j' , ".---");
        morse.put('k' , "-.-");
        morse.put('l' , ".-..");
        morse.put('m' , "--");
        morse.put('n' , "-.");
        morse.put('o' , "---");
        morse.put('p' , ".--.");
        morse.put('q' , "--.-");
        morse.put('r' , ".-.");
        morse.put('s' , "...");
        morse.put('t' , "-");
        morse.put('u' , "..-");
        morse.put('v' , "...-");
        morse.put('w' , ".--");
        morse.put('x' , "-..-");
        morse.put('y' , "-.--");
        morse.put('z' , "--..");
        
        for(int i=0 ; i<words.length ; i++){
            String temp = "";
            for(int j=0 ; j<words[i].length() ; j++){
                temp = temp+morse.get(words[i].charAt(j));
            }
            hash.put(temp , hash.getOrDefault(temp , 0)+1);
        }
        
        return hash.size();
    }
}