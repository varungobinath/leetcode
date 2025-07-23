class Solution {
    public int climbStairs(int n) {
        int[][] result = {{1, 0}, {0, 1}};
        int[][] base = {{1, 1}, {1, 0}};
        int power = n ;

        while (power > 0) {
            if (power % 2 == 1) {
                result = multiply(result, base);
            }
            base = multiply(base, base);
            power = power / 2;
        }

        return result[0][0];
    }
    public int[][] multiply(int[][] a,int[][] b){
        int x = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        int y = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        int z = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        int w = a[1][0] * b[0][1] + a[1][1] * b[1][1];
        int[][] res = new int[2][2];
        res[0][0] = x;
        res[0][1] = y;
        res[1][0] = z;
        res[1][1] = w;
        return res;
    }
}