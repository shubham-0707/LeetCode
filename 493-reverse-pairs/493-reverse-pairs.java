class Solution {
    
    public static int merge(int[] arr ,  int start , int mid , int end){
        int count = 0;
        int j=mid+1;
        for(int i=start  ; i<=mid ; i++){
            while(j<=end && arr[i]>2*(long)arr[j]){
                j++;
            }
            count+=(j-(mid+1));
        }
        
        int low = start;
        int high=mid+1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(low<=mid && high<=end){
            if(arr[low]<=arr[high]){
                ans.add(arr[low]);
                low++;
            }
            else{
                ans.add(arr[high]);
                high++;
            }
        }
        while(low<=mid){
            ans.add(arr[low]);
            low++;
        }
        while(high<=end){
            ans.add(arr[high]);
            high++;
        }
        
        for(int idx=start ; idx<=end ; idx++){
            arr[idx] = ans.get(idx-start);
        }
        
        return count;
    }
    
    public static int mergeSort(int[] arr , int start , int end){
        int count = 0;
        
        if(start<end){
            int mid = start + (end-start)/2;
            count+=mergeSort(arr , start , mid);
            count+=mergeSort(arr , mid+1 , end);
            count+=merge(arr , start , mid , end);
        }
        return count;
    }
    
    public int reversePairs(int[] nums) {
        return mergeSort(nums , 0 , nums.length-1);
    }
}