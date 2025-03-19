class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int count = 0;
        int l = 0;
        int maxlen = 0;
        for(int r=0;r<n;r++){
            if(nums[r]==0) count++;
            while(count==2){
                if(nums[l]==0) count--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l);
        }
        return maxlen;
    }
}