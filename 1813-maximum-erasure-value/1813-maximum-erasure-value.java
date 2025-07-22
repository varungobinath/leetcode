class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int n = nums.length, l = 0;
        int max_sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r=0;r<n;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            sum += nums[r];
            while(map.get(nums[r])>1){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                sum -= nums[l];
                l++;
            }
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum;
    }
}