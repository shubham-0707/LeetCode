class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        HashMap<Integer, List<Integer>> topLeftMap = new HashMap<>();
        for(int i=0 ; i<grid.length ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0 ; j<grid[0].length ; j++){
                HashSet<Integer> set = new HashSet<>();
                int x = i;
                int y= j;
                while(x>0 && y>0){
                    set.add(grid[x-1][y-1]);
                    x--;
                    y--;
                }
                temp.add(set.size());
            }
            topLeftMap.put(i, temp);
        }

        HashMap<Integer , List<Integer>> bottomRightMap = new HashMap<>();
        for(int i=0 ; i<grid.length ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0 ; j<grid[0].length ; j++){
                HashSet<Integer> set = new HashSet<>();
                int x = i;
                int y = j;
                while(x<grid.length-1 && y<grid[0].length-1){
                    set.add(grid[x+1][y+1]);
                    x++;
                    y++;
                }
                temp.add(set.size());
            }
            bottomRightMap.put(i, temp);
        }


        int[][] ans = new int[grid.length][grid[0].length];
        for(int i=0 ; i<grid.length ; i++){
            List<Integer> topLeft = topLeftMap.get(i);
            List<Integer> bottomRight = bottomRightMap.get(i);
            for(int j=0 ; j<grid[0].length ; j++){
                ans[i][j] = Math.abs(topLeft.get(j)-bottomRight.get(j));
            }
        }
        return ans;
    }
}