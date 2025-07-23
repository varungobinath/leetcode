class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] initial = new int[m][n];
        for(int[] pos : indices){
            convert(initial,m,n,pos[0],pos[1]);
        }
        int count = 0;
        for(int[] i : initial){
            for(int j : i){
                if(j%2==1) count++;
            }
        }
        return count;
    }
    public void convert(int[][] initial,int m,int n,int r,int c){
        for(int i=0;i<n;i++){
            initial[r][i]++;
        }
        for(int i=0;i<m;i++){
            initial[i][c]++;
        }
    }
}