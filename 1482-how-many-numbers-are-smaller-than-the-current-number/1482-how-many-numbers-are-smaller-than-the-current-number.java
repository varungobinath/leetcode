class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] hash = new int[101];
        int max = -1;
        for(int i : nums){
            hash[i]++;
            max = Math.max(max,i);
        }
        int[] ans = new int[nums.length];
        for(int i=1;i<=max;i++){
            hash[i]+=hash[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                ans[i] = 0;
            else
                ans[i] = hash[nums[i]-1];
        }
        return ans;
    }
}