class Solution {
    
    public int getBeauty(int[] arr){
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0 ; i<arr.length ; i++){
            maxi = Math.max(maxi , arr[i]);
            if(arr[i]!=0)
            mini = Math.min(mini , arr[i]);
        }
        
        return maxi - mini;
    }
    
    public int beautySum(String s) {
        int ans = 0;
        
        for(int i=0 ; i<s.length() ; i++){
            int[] arr = new int[26];
            for(int j=i ; j<s.length() ; j++){
                arr[s.charAt(j)-97]++;
                ans+=getBeauty(arr);
            }
        }
        
        return ans;
    }
}