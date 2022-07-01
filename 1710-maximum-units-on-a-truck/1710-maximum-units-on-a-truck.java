class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));
        
        
        int maximumUnits = 0;
        
        for(int[] box : boxTypes){
           int no_of_boxes = box[0];
            int no_of_units = box[1];
            
            if(truckSize>=box[0]){
                maximumUnits+=no_of_boxes*no_of_units;
                truckSize-=no_of_boxes;
            }
            else{
                maximumUnits+=no_of_units*truckSize;
                break;
            }
            
        }
        return maximumUnits;
    }
}