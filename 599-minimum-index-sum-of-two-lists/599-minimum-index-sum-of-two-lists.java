class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> arr = new ArrayList<String>();
        
        int min = 10000;
        for(int i=0 ; i<list1.length ; i++){
            for(int j=0; j<list2.length ; j++){
                if(list1[i].equals(list2[j]) && (i+j)<min){
                    min = i+j;
                    arr.clear();
                    arr.add(list1[i]);
                }
                else if(list1[i].equals(list2[j]) && (i+j)==min){
                    min = i+j;
                    arr.add(list1[i]);
                }
            }
        }
        
        String[] ans = new String[arr.size()];
        for(int i=0 ; i<arr.size() ; i++){
            ans[i] = arr.get(i);
        }
        
        return ans;
    }
}