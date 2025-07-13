class Solution {
    public int minPathSum(int[][] grid) {
        Integer[][] dp = new Integer[grid.length][grid[0].length];
        return minPath(grid,grid.length-1,grid[0].length-1,dp);
    }
    public int minPath(int[][] grid,int r,int c,Integer[][] dp){
        if(r==0 && c==0){
            return grid[0][0];
        }
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[r][c]!=null) return dp[r][c];
        int up = minPath(grid,r-1,c,dp);
        int left = minPath(grid,r,c-1,dp);
        return dp[r][c] = grid[r][c]+Math.min(up,left);
    }
}