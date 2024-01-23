class Solution {
    private int maxLength = 0;
    private void solve(List<String> arr , String current , int currentLength, int start) {
        if(maxLength < currentLength) {
            maxLength = currentLength;
        }

        for(int i=start ; i<arr.size() ; i++) {
            if(!isValid(current , arr.get(i))) continue;
            solve(arr , current + arr.get(i) , (current+arr.get(i)).length(), i+1);
        }
    }
    private boolean isValid(String current, String mayAppend) {
        int previousLength = (current + mayAppend).length();

        Set<Character> set = new HashSet<Character>();
        for(int i=0 ; i<current.length() ; i++) {
            set.add(current.charAt(i));
        }
        
        for(int i=0 ; i<mayAppend.length() ; i++) {
            set.add(mayAppend.charAt(i));
        }

        if(previousLength == set.size()) return true;
        return false;
    }
    public int maxLength(List<String> arr) {
        solve(arr , "" , 0 , 0);
        return maxLength;
    }
}