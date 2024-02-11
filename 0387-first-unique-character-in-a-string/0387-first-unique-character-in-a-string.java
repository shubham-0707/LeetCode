class Pair {
    int count;
    int index;
    Pair(int count , int index){
        this.count = count;
        this.index = index;
    }
}
class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character , Pair> hash = new LinkedHashMap<Character, Pair>();

        for(int i=0 ; i<s.length() ; i++){
            if(!hash.containsKey(s.charAt(i))) {
                hash.put(s.charAt(i) , new Pair(1 , i));
            } else {
                hash.put(s.charAt(i) , new Pair(hash.get(s.charAt(i)).count + 1 , i));
            }
        }

        for(char i : hash.keySet()) {
            if(hash.get(i).count == 1) return hash.get(i).index;
        }

        return -1;
    }
}