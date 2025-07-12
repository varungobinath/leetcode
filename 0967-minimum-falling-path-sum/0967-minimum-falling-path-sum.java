class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        Integer[][] dp = new Integer[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            min = Math.min(min, minFall(matrix, 0, i,dp));
        }
        return min;
    }

    public int minFall(int[][] matrix, int r, int c,Integer[][] dp) {
        if (c < 0 || c >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }
        if (r == matrix.length - 1) {
            return matrix[r][c];
        }
        if(dp[r][c]!=null) return dp[r][c];

        int left = minFall(matrix, r + 1, c - 1,dp);
        int down = minFall(matrix, r + 1, c,dp);
        int right = minFall(matrix, r + 1, c + 1,dp);

        return dp[r][c] = matrix[r][c] + Math.min(left, Math.min(down, right));
    }
}
