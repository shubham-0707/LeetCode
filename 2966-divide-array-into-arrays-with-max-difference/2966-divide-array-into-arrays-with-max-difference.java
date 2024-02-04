class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            if(temp.size()==0){
                temp.add(nums[i]);
            } else {

                if(Math.abs(nums[i]-temp.get(0))<=k){
                    System.out.println("Add hua");
                temp.add(nums[i]);
            }

            if(temp.size()==3){
                ans.add(temp);
                System.out.println("Yahan pahucha");
                temp = new ArrayList<>();
            }
            }
        }
        System.out.println("Answer size: "+ans.size());
        if(ans.size()*3!=nums.length) return new int[][]{};
        return ans.stream().map(innerList -> innerList.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
    }
}