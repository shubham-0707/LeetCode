class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        
        TreeMap<Integer , ArrayList<Integer>> hash = new TreeMap<>();
        
        for(int i=0 ; i<points.length ; i++){
            int a = points[i][0];
            int b = points[i][1];
            
            int dist = a*a + b*b;
            
            ArrayList<Integer> temp = hash.get(dist);
            if(temp==null){
                temp = new ArrayList<>();
                temp.add(i);
                hash.put(dist , temp);
            }
            else{
                temp.add(i);
            }
        }
        
        int count = 0;
        for(int i : hash.keySet()){
            ArrayList<Integer> temp = hash.get(i);
            boolean flag = false;
            for(int j=0 ; j<temp.size() ; j++){
                ans[count++] = points[temp.get(j)];
                if(count==k){
                    flag = true;
                    break;
                }
            }
            if(flag == true)break;
        }
        
        return ans;
    }
}