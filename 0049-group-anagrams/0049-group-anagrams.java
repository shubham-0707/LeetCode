class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<Integer>> hash = new HashMap<>();

        for(int i=0 ; i<strs.length ; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String tempString = new String(str);
            if(!hash.containsKey(tempString)) {
                List<Integer> arr = new ArrayList<Integer>();
                arr.add(i);
                hash.put(tempString, arr);
            } else {
                hash.get(tempString).add(i);
            }
        }


        List<List<String>> ans = new ArrayList<>();
        for(String str : hash.keySet()) {
            List<String> tempList = new ArrayList<>();
            List<Integer> hashList = hash.get(str);
            for(int i=0 ; i<hashList.size() ; i++) {
                tempList.add(strs[hashList.get(i)]);
            }
            ans.add(tempList);
        }

        return ans;
    }
}