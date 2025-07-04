class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        Boolean[][] memo = new Boolean[s1.length() + 1][s2.length() + 1];
        return recurCheck(s1, s2, s3, 0, 0, memo);
    }

    public boolean recurCheck(String s1, String s2, String s3, int i, int j, Boolean[][] memo) {
        if (i == s1.length() && j == s2.length()) return true;

        if (memo[i][j] != null) return memo[i][j];

        int k = i + j;

        boolean valid = false;

        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            valid = recurCheck(s1, s2, s3, i + 1, j, memo);
        }

        if (!valid && j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            valid = recurCheck(s1, s2, s3, i, j + 1, memo);
        }

        memo[i][j] = valid;
        return valid;
    }
}
