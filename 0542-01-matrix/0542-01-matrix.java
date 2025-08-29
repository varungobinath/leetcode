class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] pr = {-1,0,0,1};
        int[] pc = {0,-1,1,0};
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    queue.offer(new int[]{i,j});
                    visited.add(i+","+j);
                }
            }
        }
        int path_count = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int count=0;count<size;count++){
                int[] pos = queue.poll();
                for(int i=0;i<4;i++){
                    int nr = pos[0]+pr[i];
                    int nc = pos[1]+pc[i];
                    if(nr>=0 && nc>=0 && nr<row && nc<col && !visited.contains(nr+","+nc)){
                        mat[nr][nc] = path_count;
                        visited.add(nr+","+nc);
                        queue.offer(new int[]{nr,nc});
                    }
                }
            }
            path_count++;
        }
        return mat;
    }
}