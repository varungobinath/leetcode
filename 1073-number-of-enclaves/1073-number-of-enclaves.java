class Solution {
    public int numEnclaves(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        for(int r=0;r<row;r++){
            if(board[r][0]==1){
                dfs(board,row,col,r,0);
            }
            if(board[r][col-1]==1){
                dfs(board,row,col,r,col-1);
            }
        }
        for(int c=0;c<col;c++){
            if(board[0][c]==1){
                dfs(board,row,col,0,c);
            }
            if(board[row-1][c]==1){
                dfs(board,row,col,row-1,c);
            }
        }
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==1) count+=1;
            }
        }
        return count;
    }
    void dfs(int[][] board,int row,int col,int r,int c){
        if(r<0 || c<0 || r>=row || c>=col || board[r][c]==0 || board[r][c]==2) return;
        board[r][c] = 2;
        dfs(board,row,col,r-1,c);
        dfs(board,row,col,r,c-1);
        dfs(board,row,col,r,c+1);
        dfs(board,row,col,r+1,c);
    }
}