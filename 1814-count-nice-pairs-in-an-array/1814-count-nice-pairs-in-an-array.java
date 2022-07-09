class Solution {
    final long MOD = (long)Math.pow(10 , 9)+7;
    public static int rev(int n){
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public int countNicePairs(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            nums[i]-=rev(nums[i]);
            
        }
        long count=0;
        HashMap<Integer , Integer > hash = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
        }
        
        for(int i:hash.keySet()){
            int n = hash.get(i);
            
            count+=((n*(n-1L))/(2L))%MOD;
        }
        
        return (int)(count%MOD);
    }
}