class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        
        HashMap<Integer , Integer> hash = new HashMap<>();
        
        for(int i=0 ; i<arr.length ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }
        
        int count = 0;
        for(int i=1 ; i<=2000 ; i++){
            if(!hash.containsKey(i)){
                count++;
            }
            
            if(count==k){
                return i;
            }
        }
        
        return -1;
    }
}