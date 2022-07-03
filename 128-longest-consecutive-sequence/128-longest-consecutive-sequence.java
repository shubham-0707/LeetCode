class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i:arr){
            hash.add(i);
        }
        
        int maxi = 0;
        
        
        for(int i : hash){
            if(!hash.contains(i-1)){
                int num = i;
                int count = 1;
                
                while(hash.contains(num+1)){
                    num+=1;
                    count+=1;
                }
                maxi = Math.max(maxi , count);
            }
        }
        
        return maxi;
    }
}