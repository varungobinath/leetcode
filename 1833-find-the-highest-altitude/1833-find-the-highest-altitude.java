class Solution {
    public int largestAltitude(int[] gain) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : gain){
            sum += i;
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum>0?max_sum:0;
    }
}