class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] hash = new int[(n*n)+1];
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                hash[grid[i][j]]++;
                if(hash[grid[i][j]]==2){
                    ans[0] = grid[i][j];
                }
            }
        }
        for(int i=1;i<=n*n;i++){
            if(hash[i]==0){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}