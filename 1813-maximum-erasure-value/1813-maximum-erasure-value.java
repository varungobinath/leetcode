class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int n = nums.length, l = 0;
        int max_sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int r=0;r<n;r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            set.add(nums[r]);
            sum += nums[r];
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum;
    }
}