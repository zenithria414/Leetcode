class Solution {
    public static Boolean isSafe(char board[][], int row, int col){
        for(int i=row-1; i>=0; i--){
            if(board[i][col]== 'Q'){
                return false;
            }
        }
        //diagonally left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]== 'Q'){
                return false;
            }
        }

        //diagonally left
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]== 'Q'){
                return false;
            }
        }
        return true;
    }

    public static List<List<String>> nqueens(char board[][], int row){
        List<List<String>> result = new ArrayList<>();
        if(row==board.length){
            result.addAll(nqueens(board, row + 1));
            return result;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j] = '.';
            } 
        }
        return result;
    }
    public static List<String> appendtolist(char board[][]){
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }

        return res;
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        return (nqueens(board,0));
    }
}