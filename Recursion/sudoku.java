package Recursion;

// Function for sudoku.

public class sudoku{
    public boolean issafe(char[][] board, int row, int col, int n){
        // row and column

        for(int i = 0; i < board.length; i++){
            if(board[i][col] == (char)(n + '0')){ 
                return false;
            }

            if(board[row][i] == (char)(n + '0')){
                return false;
            }
        }

        ///grid
        int sr = (r*3) / 3;
        int sc = (c*3) / 3;
        
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == (char)(n + '0')){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col + 1;
        }
        else{
            nrow = row + 1;
            ncol = 0;
        }

        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        }
        else{
            for(int i = 1; i < 9; i++){
                if(issafe(board, row, col, i)){
                    board[row][col] = (char)(i + '0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    public void solvesudoku(char[][] board){
        helper(board, 0, 0);
    }
    public static void main(String[] args) {
        
    }
}