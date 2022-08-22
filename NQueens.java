class Solution {
    public boolean isSafe(int row, int col, char[][] board) {
        // horizontal
        for(int i=0; i<col; i++) {
            if(board[row][i]=='Q')
                return false;
        }
        
        // upper left
        int r = row;
        for(int c=col; c>=0 && r>=0;  c--, r--) {
            if(board[r][c]=='Q')
                return false;
        }
        // lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c]=='Q')
                return false;
        }
        return true;
    }
    
    public void saveBoard(char[][] board, List<List<String>> solutions) {
        String row;
        List<String> newBoard = new ArrayList<>();
        
        for(int i=0; i<board.length; i++) {
            row = "";
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j]=='Q')
                   row+='Q';
                else
                   row+='.';
            }
            newBoard.add(row);
        }
        solutions.add(newBoard);
    }
    public void backtracking(char[][] board, List<List<String>> solutions, int col) {
        if(col==board.length){
            saveBoard(board, solutions);
            return;
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(row, col, board)) {
                board[row][col] = 'Q';
                backtracking(board, solutions, col+1);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        backtracking(board, solutions, 0);
        return solutions;
    }
}

// O(n*n)