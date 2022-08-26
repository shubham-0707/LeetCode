class Solution {
    
    public static int[] count(int n){
        int[] arr = new int[10];
        
        while(n>0){
            arr[n%10]++;
            n/=10;
        }
        
        return arr;
    }
    
    public boolean reorderedPowerOf2(int n) {
        
        int[] arr = count(n);
        
        for(int i=0 ; i<31 ; i++){
            if(Arrays.equals(arr , count(1<<i)))
                return true;
        }
        
        return false;
        
    }
}