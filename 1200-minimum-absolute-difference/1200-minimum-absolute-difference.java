class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        
        for(int i=1 ; i<arr.length ; i++){
            mini = Math.min(mini , arr[i]-arr[i-1]);
        }
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i=1 ; i<arr.length ; i++){
            List<Integer> li = new ArrayList<Integer>();
            if((arr[i]-arr[i-1])==mini){
                li.add(arr[i-1]);
                li.add(arr[i]);
            }
            if(li.size()>0){
                list.add(li);
            }
        }
        return list;
    }
}