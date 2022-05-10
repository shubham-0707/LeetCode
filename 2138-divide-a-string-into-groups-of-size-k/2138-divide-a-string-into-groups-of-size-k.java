class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> groups = new ArrayList<String>();
        
        int x=0;
        String str = "";
        for(int i=0 ; i<s.length() ; i++){
            str = str+s.charAt(i);
            x++;
            
             if(x==k){
                 groups.add(str);
                 str="";
                 x=0;
             }
        }
        
        if(str.length()>0){
            while(str.length()<k){
                str=str+fill;
            }
            groups.add(str);
        }
        
        int n = groups.size();
        String[] arr = new String[n];
        
        for(int i=0 ; i<n ; i++){
            arr[i] = groups.get(i);
        }
        
        return arr;
        
    }
}