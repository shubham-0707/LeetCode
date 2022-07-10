class Solution {
    public String intToRoman(int num) {
        LinkedHashMap<Integer , String> hash = new LinkedHashMap<>();
        
        hash.put(1000 , "M");
        hash.put(900 , "CM");
        hash.put(500 , "D");
        hash.put(400 , "CD");
        hash.put(100 , "C");
        hash.put(90 , "XC");
        hash.put(50 , "L");
        hash.put(40 , "XL");
        hash.put(10 , "X");
        hash.put(9 , "IX");
        hash.put(5 , "V");
        hash.put(4 , "IV");
        hash.put(1 , "I");
        
        
        StringBuilder str = new StringBuilder();
        for(Map.Entry<Integer , String> i : hash.entrySet()){
            while(num >=i.getKey()){
                str.append(i.getValue());
                num-=i.getKey();
            }
        }
        
        return str.toString();
    }
}