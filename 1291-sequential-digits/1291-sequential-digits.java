class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int lowDigits = String.valueOf(low).length();
        int highDigits = String.valueOf(high).length();
        String tempString = "123456789";

        List<Integer> ans = new ArrayList<>();
        for(int i=lowDigits ; i<=highDigits ; i++){
            int x = 0;
            while((i+x)<=tempString.length()) {
                String tst = tempString.substring(x , (x+i));
                int tstInt = Integer.valueOf(tst);
                if(tstInt > high) return ans;
                if ( tstInt >= low && tstInt <= high) {
                    ans.add(tstInt);
                }
                x++;
            }
        }
        return ans;
    }
}