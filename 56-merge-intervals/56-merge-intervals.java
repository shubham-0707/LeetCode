class Solution {
    public int[][] merge(int[][] arr) {
       

        Arrays.sort(arr , (a, b)-> a[0]-b[0]);


        // adding the first element to the arraylist...
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arr[0][0]);
        temp.add(arr[0][1]);
        ans.add(temp);




        // checking for other intervals and adding them to the answer list...
        int a = 0;
        int b = 0;
        for(int i=1 ; i<arr.length ; i++){
            ArrayList<Integer> tempi = new ArrayList<>();
            if(arr[i][0]>=ans.get(ans.size()-1).get(0) && arr[i][1]<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            else if(arr[i][0]<=ans.get(ans.size()-1).get(1)){
                a = ans.get(ans.size()-1).get(0);
                ans.remove(ans.size()-1);
            }
            else {
                a = arr[i][0];
            }
            b = arr[i][1];
            tempi.add(a);
            tempi.add(b);
            ans.add(tempi);

        }
        
        int[][] interval = new int[ans.size()][2];
        
        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<2 ; j++){
                interval[i][j] = ans.get(i).get(j);
            }
        }
       return interval;
    }
}