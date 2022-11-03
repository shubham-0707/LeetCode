class Solution {
    
    public void reverse(char[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            char ch = arr[start];
            arr[start] = arr[end];
            arr[end] = ch;
            start++;
            end--;
        }
        
    }
    
    public int longestPalindrome(String[] words) {
        HashMap<String , Integer> hash = new HashMap<>();
        for(int i=0 ; i<words.length ; i++){
            hash.put(words[i] , hash.getOrDefault(words[i] , 0)+1);
        }
        
        int maxi = 0;
        int count = 0;
        boolean flag = false;
        for(String str : hash.keySet()){
            char[] ch = str.toCharArray();
            reverse(ch);
            String temp = new String(ch);
            
            if(str.charAt(0)==str.charAt(1)){
                maxi = maxi + hash.get(str)/2;
                if(hash.get(str)%2==1) flag=true;
            }
            
            else if(hash.containsKey(temp) && hash.get(temp)!=-1 && hash.get(str)!=-1){
                count+=4*Math.min(hash.get(str) , hash.get(temp));
                hash.put(str , -1);
                hash.put(temp , -1);
            }
            
        }
        
        //System.out.println(maxi);
        
        count = count+ maxi*4;
        if(flag==true) count+=2;
        
        return count;
    }
}