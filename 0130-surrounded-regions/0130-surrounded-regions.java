class Solution {
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        for(int i=0;i<r;i++){
            if(board[i][0]=='O'){
                dfs(board,r,c,i,0);
            }
            if(board[i][c-1]=='O'){
                dfs(board,r,c,i,c-1);
            }
        }
        for(int i=0;i<c;i++){
            if(board[0][i]=='O'){
                dfs(board,r,c,0,i);
            }
            if(board[r-1][i]=='O'){
                dfs(board,r,c,r-1,i);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O') board[i][j] = 'X';
                else if(board[i][j]=='+') board[i][j] = 'O';
            }
        }
    }
    static int[] pr = {-1,0,0,1};
    static int[] pc = {0,-1,1,0};
    public void dfs(char[][] board,int r,int c,int i,int j){
        if(i<0 || j<0 || i>=r || j>=c || board[i][j]=='X' || board[i][j]=='+') return;
        board[i][j] = '+';
        for(int k=0;k<4;k++){
            dfs(board,r,c,i+pr[k],j+pc[k]);
        }
    }
}