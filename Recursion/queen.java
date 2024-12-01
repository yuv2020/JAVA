package Recursion;

import java.util.List;

public class queen {
    public boolean isSafe(int row, int col, char[][]board){
        
        // Vertical Alignment
        for(int i = 0; i<board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //Horizontal Alignment
        for(int i=0; i<board.length; i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }


        //Upper left
        int  r= row;
        for(int c = col; c > 0 && r>=0; c--; r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }


        //Upper right
        r=row;
        for(int c = col; c < board[0].length && r--; c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //Lower left
        r=row;
        for(int c = col; c >= 0; r<board.length; r++; c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower right
        r = row;
        for(int c=col; c<board.length && r<board.length; c++; r++){
            if(board[r][c] == 'Q'){
                return false; 
            }   
        }

        return true;
    }

    public static void saveboard(char[][] board, List<List<Integer>> allboard){
        String row = "";
        List<String> boardlist = new ArrayList<String>();
        for(int i=0; i<board.length; i++){
            row = "";
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] =='Q'){
                    row += "Q ";
                }
                else{
                    row += ". ";
                }

            }
            boardlist.add();
        }
        allboard.add(boardlist);

    }
    public static void helper(char[][] board, List<List<Integer>> allboard, int col){
        if(col == board.length){
            saveboard(board, allboard);
            return;
        }
        for(int row = 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                allboard.add(convertToList(board));
                helper(board, allboard, col+1);
                board[row][col] = '.';
                
            }
        }
    }

    public List<List<Integer>> allboards = new ArrayList<List<Integer>>();
    char[][] board = new board[n][n];
    
    helper(board, allboard, 0);

    public static void main(String[] args){
        char[][] board = new char[][]{
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
            };
            Solution solution = new Solution();
            solution.solveNQueens(board);
            
    }

    
}
