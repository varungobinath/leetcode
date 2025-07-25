class Solution {
    public int maxSum(int[] nums) {
        int sum = 0;
        int[] hash = new int[101];
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            if(i>=0 && hash[i]==0){
                sum += i;
                hash[i]++;
            }
            max = Math.max(max,i);
        }
        return sum==0?max:sum;
    }
}