class Solution {
    public static boolean binary_search(int[] arr2 , int start , int end , int key){
        boolean flag = false;
        while(start<=end){
            
            int mid = start + (end-start)/2;
            
            if(arr2[mid]==key){
                flag = true;
                break;
            }
            else if(arr2[mid]<key){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return flag;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();        
        for(int i:nums1){
            set1.add(i);
        }
        
        for(int j:nums2){
            set2.add(j);
        }
        
        int arr1[] = new int[set1.size()];
        int x=0;
        
        int arr2[] = new int[set2.size()];
        int y=0;
        
        for(int b:set1){
            arr1[x]=b;
            x++;
        }
        
        for(int c:set2){
            arr2[y]=c;
            y++;
        }
        
        LinkedHashSet<Integer> ans = new LinkedHashSet<Integer>();
        Arrays.sort(arr2);
        
        for(int z:arr1){
            if(binary_search(arr2 , 0 , arr2.length-1 , z)){
                ans.add(z);
            }
        }
        
        int arr3[] = new int[ans.size()];
        int k=0;
        
        for(int v:ans){
            arr3[k]=v;
            k++;
        }
        
        return arr3;
        
    }
}