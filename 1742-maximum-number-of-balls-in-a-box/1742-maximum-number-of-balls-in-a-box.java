class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
        LinkedHashMap<Integer , Integer> hash = new LinkedHashMap<>();
        int maxi = Integer.MIN_VALUE;
        
        for(int i=lowLimit ; i<=highLimit ; i++){
            int n = i;
            int sum = 0;
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            hash.put(sum , hash.getOrDefault(sum , 0)+1);
            maxi = Math.max(maxi , hash.get(sum));
        }
        
        return maxi;
    }
}