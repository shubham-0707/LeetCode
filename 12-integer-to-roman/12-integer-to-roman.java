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
        hash.put(5 ,"V");
        hash.put(4 , "IV");
        hash.put(1 , "I");
        
        String ans = "";
        for(int i : hash.keySet()){
            while(num>=i){
                ans = ans + hash.get(i);
                num-=i;
            }
        }
        return ans;
    }
}