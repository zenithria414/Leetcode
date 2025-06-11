class Solution {
    public boolean isSafe(char[][] board, int row, int col, char dig){
        //row
        for(int i=0; i<9; i++){
            if(board[row][i] == dig) return false;
        }

        //col
        for(int j=0; j<9;j++){
            if(board[j][col] == dig) return false;
        }

        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j]==dig) return false;
            }
        }
        return true;
    }
    public Boolean sudokuSolver(char[][] board , int row, int col){
        if(row==9) return true;
        int nextRow = row;
        int nextCol = col+1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(board[row][col] != '.'){
            return sudokuSolver(board,nextRow, nextCol);
        }
        for(int dig=1; dig<=9; dig++){
            char digit = (char) (dig + '0');
            if(isSafe(board,row,col,digit)){
                board[row][col] = digit;
                if(sudokuSolver(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public void printBoard(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(board[i][j]+',');
            }
            System.out.println();
        }
    }
    public void solveSudoku(char[][] board) {
        if(sudokuSolver(board,0,0)){
            printBoard(board);
        } else{
            System.out.println("Solution does not exist");
        }
    }
}
