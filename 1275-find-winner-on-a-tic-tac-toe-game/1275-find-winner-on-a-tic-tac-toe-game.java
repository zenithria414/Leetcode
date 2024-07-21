class Solution {
    public String winner(char[][] board){
        //checking rows
        for(int i=0; i<3; i++){
            int countA=0;
            int countB=0;
            for(int j=0; j<3; j++){
                if(board[i][j]=='X') countA++;
                if(board[i][j]=='O') countB++;
            }
            if(countA==3) return "A";
            if(countB==3) return "B";
        }
        
        //checking columns
        for(int j=0; j<3; j++){
            int countA=0;
            int countB=0;
            for(int i=0; i<3; i++){
                if(board[i][j]=='X') countA++;
                if(board[i][j]=='O') countB++;
            }
            if(countA==3) return "A";
            if(countB==3) return "B";
        }
        
        //chceking diagonals
        if(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X') return "A";
        if(board[0][0]=='O' && board[1][1]=='O' && board[2][2]=='O') return "B";
        if(board[0][2]=='X' && board[1][1]=='X' && board[2][0]=='X') return "A";
        if(board[0][2]=='O' && board[1][1]=='O' && board[2][0]=='O') return "B";

        //Pending and Draw
        int count=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j]=='X' || board[i][j]=='O') count++;
            }
        }
        if(count != 9)
            return "Pending";
        else
            return "Draw";
    }
    
    public String tictactoe(int[][] moves) {
        //creating board
        char[][] board = new char[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j] = '.';
            }
        }
        
        for(int i=0; i<moves.length; i++){
            if(i%2==0)
                board[moves[i][0]][moves[i][1]]='X';
            else
                board[moves[i][0]][moves[i][1]]='O';
        }
        
        return winner(board);
    }
    
}