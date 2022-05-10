class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
       List<List<Integer>> group = new ArrayList<>();
        

        int count = 0;
        for(int i=0 ; i<s.length()-1 ; i=i+count){
            List<Integer> sub_group = new ArrayList<>();
            count = 1;
            

            int x = i;
            while(x<s.length()-1 && s.charAt(x)==s.charAt(x+1)){
                count++;
                x++;
            }

            if(count>=3){
                sub_group.add(i);
                sub_group.add(i+count-1);
                group.add(sub_group);
            }
        }
        return group;
    }
}