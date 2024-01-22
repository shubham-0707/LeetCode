class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            hash.put(arr[i], hash.getOrDefault(arr[i], 0)+1);
        }
        int size = hash.size();
        HashSet<Integer> set = new HashSet<>();
        for(int i: hash.values()){
            set.add(i);
        }
        if(size == set.size()) return true;
        return false;
    }
}