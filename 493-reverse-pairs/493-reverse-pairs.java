class Solution {
    
    public static int merge(int[] arr , int start , int mid , int end){
        int count = 0;
        int j = mid+1;
        
        for(int i=start ; i<=mid ; i++){
            while(j<=end && arr[i]>2*(long)arr[j]){
                j++;
            }
            count += (j-(mid+1));
        }
        
        int i = start;
        int jt = mid+1;
        
        ArrayList<Integer> temp = new ArrayList<>();
        while(i<=mid && jt<=end){
            if(arr[i]<=arr[jt]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[jt]);
                jt++;
            }
        }
        
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(jt<=end){
            temp.add(arr[jt]);
            jt++;
        }
        
        for(int idx=start ; idx<=end ; idx++){
            arr[idx] = temp.get(idx-start);
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