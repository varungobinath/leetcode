class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh_orange = 0;
        Queue<int[]> queue = new LinkedList<>();
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1) fresh_orange++;
                else if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int[] pr = {-1,0,0,1};
        int[] pc = {0,-1,1,0};
        int minutes = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean isRotten = false;
            for(int i=0;i<size;i++){
                int[] pos = queue.poll();
                for(int j=0;j<4;j++){
                    int nr = pos[0]+pr[j];
                    int nc = pos[1]+pc[j];
                    if(nr>=0 && nc>=0 && nr<r && nc<c && grid[nr][nc]==1){
                        grid[nr][nc] = 2;
                        fresh_orange--;
                        queue.offer(new int[]{nr,nc});
                        isRotten = true;
                    }
                }
            }
            if(isRotten) minutes++;
        }
        return fresh_orange>0?-1:minutes;
    }
}