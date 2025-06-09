class Solution {
        private List<String> constructList(char[][] board){
        List<String> solution = new ArrayList<>();
        for(char[] row: board){
            solution.add(new String(row));
        }
        return solution;
    }

    private boolean dnc(int row, int col, int n, char[][] board){
        int dulrow = row, dulcol = col;
        while(dulcol >= 0){
            if(board[dulrow][dulcol] == 'Q') return false;
            dulcol--;
        }
        dulrow = row; dulcol = col;
        while(dulrow >= 0 && dulcol >= 0){
            if(board[dulrow][dulcol] == 'Q') return false;
            dulrow--; dulcol--;
        }
        dulrow = row; dulcol = col;
        while(dulrow < n && dulcol >= 0){
            if(board[dulrow][dulcol] == 'Q') return false;
            dulrow++; dulcol--;
        }
        return true;
    }

    private void solve(int col, int n, char[][] board, List<List<String>> ans){
        if(col == n){
            ans.add(constructList(board));
            return;
        }

        for(int row = 0; row < n; row++){
            if(dnc(row, col, n, board)){
                board[row][col] = 'Q';        
                solve(col + 1, n, board, ans);
                board[row][col] = '.';        
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(0, n, board, ans);
        return ans.size();
    }
}