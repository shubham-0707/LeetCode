class Solution {
    public double average(int[] salary) {
        double sum = 0;
        int n = salary.length;
        Arrays.sort(salary);
        for(int i=1 ; i<n-1 ; i++){
            sum+=salary[i];
        }
        
        return sum/(n-2);
    }
}