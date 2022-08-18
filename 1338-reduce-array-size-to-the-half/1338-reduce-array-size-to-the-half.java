class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }
        
        TreeMap<Integer , Integer> tree = new TreeMap<>(Collections.reverseOrder());
        for(int i:hash.keySet()){
            tree.put(hash.get(i) , tree.getOrDefault(hash.get(i) , 0)+1);
        }
        
        int min = 0;
        int sum = 0;
        boolean flag = false;
        for(int i:tree.keySet()){
            int num = tree.get(i);
            while(num>0){
               sum+=i;
               min++;
            if(arr.length-sum<=arr.length/2){
                flag=true;
                break;
            } 
                num--;
        }
            if(flag==true){
                break;
            }
        }
        return min;
    }
}