class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int max = 0;
        int[][] dp = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int length = dfs(dp,matrix,i,j,-1);
                max = Math.max(length,max);
            }
        }
        return max;
    }
    public int dfs(int[][] dp,int[][] matrix,int r,int c,int pre){
        if (r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length) {
            return 0;
        }
        if(matrix[r][c]<=pre) return 0;
        if(dp[r][c]!=0) return dp[r][c];
        int cur = matrix[r][c];
        int tempMax = 0;
        tempMax = Math.max(dfs(dp, matrix, r - 1, c, cur), tempMax);
        tempMax = Math.max(dfs(dp, matrix, r + 1, c, cur), tempMax);
        tempMax = Math.max(dfs(dp, matrix, r, c - 1, cur), tempMax);
        tempMax = Math.max(dfs(dp, matrix, r, c + 1, cur), tempMax);
        dp[r][c] = ++tempMax;
        return tempMax;
    }
}