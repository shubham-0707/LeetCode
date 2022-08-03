class MyCalendar {
    ArrayList<ArrayList<Integer>> arr ;
    
    public MyCalendar() {
        arr = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        
        if(arr.size()==0){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            arr.add(temp);
            return true;
        }
        else{
           // Collections.sort(arr , (a,b)->a.get(0)-b.get(0));
            
            for(int i=0 ; i<arr.size() ; i++){
                if(arr.get(i).get(0)<end && start<arr.get(i).get(1)){
                    return false;
                }
            }
            
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            arr.add(temp);
        }
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */