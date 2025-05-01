class Solution {
    public String tictactoe(int[][] moves) {
        //00 01 02
        //10 11 12
        //20 21 22
        int[][] board = new int[3][3];
        for(int i=0;i<moves.length;i++){
            if(i%2==0){
                board[moves[i][0]][moves[i][1]] = 1;
            }else{
                board[moves[i][0]][moves[i][1]] = 2;
            }
        }
        for(int i=0;i<3;i++){
            if(board[i][0]==board[i][1] && board[i][1]==board[i][2] && board[i][0]!=0){
                return board[i][0]==1?"A":"B";
            }
            if(board[0][i]==board[1][i] && board[1][i]==board[2][i] && board[0][i]!=0){
                return board[0][i]==1?"A":"B";
            }
        }
        if(board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!=0){
            return board[0][0]==1?"A":"B";
        }
        if(board[0][2]==board[1][1] && board[1][1]==board[2][0] && board[0][2]!=0){
            return board[0][2]==1?"A":"B";
        }
        if(moves.length==9) return "Draw";
        return "Pending";

    }
}