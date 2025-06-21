class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int a1 = doRob(nums,0,n-1,dp);
        Arrays.fill(dp,-1);
        int a2 = doRob(nums,1,n,dp);
        return Math.max(a1,a2);

    }
    private int doRob(int[] arr,int ind,int n,int[] dp){
        if(ind>=n) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int take = arr[ind]+doRob(arr,ind+2,n,dp);
        int notTake = doRob(arr,ind+1,n,dp);
        return dp[ind] = Math.max(take,notTake);
    }
}