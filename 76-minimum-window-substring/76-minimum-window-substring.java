class Solution {
    public String minWindow(String s1, String s2) {
        
        
        int i=-1;
        int j=-1;
        int mct = 0;
        int dmct = s2.length();
        
        String ans = "";
        
        HashMap<Character , Integer> hash1 = new HashMap<>();
        HashMap<Character , Integer> hash2 = new HashMap<>();
        
        for(int x = 0 ; x<s2.length() ; x++){
            hash2.put(s2.charAt(x) , hash2.getOrDefault(s2.charAt(x) , 0)+1);
        }
        
        while(true){
            
            boolean f1 = false;
            boolean f2 = false;
            while(i<s1.length()-1 && mct<dmct){
                i++;
                hash1.put(s1.charAt(i) , hash1.getOrDefault(s1.charAt(i) ,0)+1);
                
                if(hash1.getOrDefault(s1.charAt(i) , 0)<=hash2.getOrDefault(s1.charAt(i) , 0)){
                    mct++;
                }
                f1 = true;
            }
            
            
            
            while(j<i && mct==dmct){
                String pans = s1.substring(j+1 , i+1);
                
                if(ans.length()==0 || pans.length()<ans.length()){
                    ans = pans;
                }
                
                j++;
                char ch = s1.charAt(j);
                
                if(hash1.get(ch)==1){
                    hash1.remove(ch);
                }
                else{
                    hash1.put(ch , hash1.get(ch)-1);
                }
                
                if(hash1.getOrDefault(ch , 0)<hash2.getOrDefault(ch , 0)){
                    mct--;
                }
                f2 = true;
            }
            
            if(f1==false && f2 == false){
                break;
            }
        }
        
        return ans;
    }
}