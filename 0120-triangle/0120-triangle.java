class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] dp = new Integer[n][n];
        return solve(triangle,0,0,dp,n);
    }
    private int solve(List<List<Integer>> tri,int r,int c,Integer[][] dp,int n){
        if(r==n-1) return tri.get(r).get(c);
        if(dp[r][c]!=null) return dp[r][c];
        int down = tri.get(r).get(c)+solve(tri,r+1,c,dp,n);
        int left = tri.get(r).get(c)+solve(tri,r+1,c+1,dp,n);
        return dp[r][c] = Math.min(down,left);
    }
}