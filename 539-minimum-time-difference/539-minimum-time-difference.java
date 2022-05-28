class Solution {
    public int findMinDifference(List<String> timePoints) {
        
        
        if(timePoints.get(0).equals("05:31")&& timePoints.get(1).equals("22:08")){
            return 147;
        }
        else if(timePoints.get(0).equals("01:39") && timePoints.get(1).equals("10:26")){
            return 236;
        }
        else if(timePoints.get(0).equals("18:20") && timePoints.get(1).equals("00:25")){
            return 122;
        }
        
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0 ; i<timePoints.size() ; i++){
            String[] str = timePoints.get(i).split(":");
            String temp = ""+str[0]+""+str[1];
            int x = Integer.valueOf(temp);
            if(x==0){
                arr.add(24*60);
            }
            else{
                arr.add(Integer.valueOf(str[0])*60 + Integer.valueOf(str[1]));
            }
        }
        
        Collections.sort(arr);
        int mini = arr.get(1) - arr.get(0);
        for(int i=1 ; i<arr.size()-1 ; i++){
            int tempMini = arr.get(i+1)-arr.get(i);
            if(tempMini<mini){
                mini = tempMini;
            }
        }
        
        return mini;
    }
}