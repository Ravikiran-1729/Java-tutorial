public class sudukoSolver {
    public static boolean solved = false;


    // public static boolean isValidSudoku(char board[][]){
    //     for(int i = 0; i<=8; i++){
    //         boolean row[] = new boolean[9];
    //         boolean col[] = new boolean[9];
    //         boolean box[] = new boolean[9];

    //         for(int j = 0; j<=8; j++){
    //             if(board[i][j]=='.'){
    //                 return false;
    //             }
                
    //             int num = board[i][j] - '1';
    //             if(row[num] == true) return false;
    //             row[num] = true;
            
    //             int num1 = board[j][i] - '1';
    //             if(col[num1] == true) return false;
    //             col[num1] = true;
                

    //             int sr = (i / 3) * 3;
    //             int sc = (j / 3) * 3;
    //             for(int k = sr; k<sr+3; k++){
    //                 for(int l = sc; l < sc+3; l++){
    //                     int num2 = board[k][l] - '1';
    //                     if(box[num2] == true) return false;
    //                     box[num2] = true;
    //                 }
    //             }
    //         }
        
    //     }
    //     return true;
    // }



    public static void main(String[] args) {
        char[][] board = {
            {'.', '.', '.', '.', '.', '.', '8', '.', '.'},
            {'.', '.', '.', '.', '.', '7', '.', '.', '9'},
            {'.', '4', '3', '.', '2', '.', '.', '.', '.'},

            {'5', '.', '.', '.', '.', '.', '.', '7', '3'},
            {'.', '.', '2', '.', '.', '.', '.', '.', '.'},
            {'1', '.', '.', '.', '.', '.', '.', '.', '.'},

            {'.', '.', '.', '3', '.', '.', '.', '6', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '5', '.', '.', '.', '.'}
        };

        System.out.println("Sudoku Puzzle is :- ");
        printBoard(board);
        System.out.println();
        helper(board,0, 0);

    }



    public static void helper(char board[][], int row, int col){
        if(row == board.length){
            solved = true;
            if(isValidSudoku(board)){
                System.out.println("Solution of Sudoku is :- ");
                printBoard(board);
            }else{
                System.err.println("Unable to Find Solution Sorry !!");
            }
            return;
        }

        if(solved) return;

        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col+1;
        }else{
            nrow = row+1;
            ncol = 0;
        }

        if(board[row][col] != '.'){
            helper(board, nrow, ncol);
        }else{
            for(int i = 1; i<= 9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i+'0');;
                    helper(board, nrow, ncol);
                    board[row][col] = '.';
                }
                
            }
        }
    }



    public static boolean isSafe(char board[][], int row, int col, int number){
        char cNumber = (char) (number +'0');

        for(int i = 0; i<board.length; i++){

            // for row
            if(board[row][i] == cNumber){
                return false;
            }

            // for column
            if(board[i][col]== cNumber){
                return false;
            }
        }
        
        // for 3x3 box
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for(int i = sr; i<sr+3; i++){
            for(int j = sc; j<sc+3; j++){
                if(board[i][j] == cNumber){
                    return false;
                }
            }
        }


        return true;
    }




    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] box = new boolean[9];

            for (int j = 0; j < 9; j++) {
                // Row check
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (row[num]) return false;
                    row[num] = true;
                }

                // Column check
                if (board[j][i] != '.') {
                    int num = board[j][i] - '1';
                    if (col[num]) return false;
                    col[num] = true;
                }

                // Box check
                int r = 3 * (i / 3) + j / 3;
                int c = 3 * (i % 3) + j % 3;
                if (board[r][c] != '.') {
                    int num = board[r][c] - '1';
                    if (box[num]) return false;
                    box[num] = true;
                }
            }
        }
        return true;
    }



    public static void printBoard(char[][] board) {
        System.out.println("-------------------------------------------------------");
        for (char[] row : board) {
            System.out.print("|  ");
            for (char ch : row) {
                System.out.print(ch + "  |  ");
            }
            System.out.println();
            System.out.println("-------------------------------------------------------");
        }
    }

}

