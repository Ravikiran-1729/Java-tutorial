import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NQueens {

    public static void saveboard(char board[][], List<List<String>> allBoards){
        List<String> newlist = new ArrayList<>();   // Neccesary to store String to Nested ArrayList like  'List<List<String>>'
                                                    // We have to  & update step wise i.e., => String ->  List<String>  -> List<List<String>>
        for(int i = 0; i<board.length; i++){
            StringBuilder row = new StringBuilder();      // Neccesary to store Characters in 'board' Array into List<String> 
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j]== 'Q'){
                    row.append("Q  ");
                }else{
                    row.append("_  ");
                }
            }
            newlist.add(row.toString());                 // Have to convert StringBuilder to String
        }
        allBoards.add(newlist);                          // Storing List<String>  -> List<List<String>>

        
    }

    public static boolean isSafe(int row, int col, char[][] board){

        // Check horizontal row TO THE LEFT
        for(int j = col; j>=0; j--){
            if(board[row][j]== 'Q'){
                return false;
            }
        }
        
        // // NO NEED TO CHECK THE SAME ROW TO THE RIGHT BECAUSE WE PLACING QUEENS FROM LEFT -> RIGHT

        // // Check horizontal row
        // for(int j = 0; j<board.length; j++){
        //     if(board[row][j]== 'Q'){
        //         return false;
        //     }
        // }

        
        // // NO NEED TO CHECK BECAUSE WE PLACING QUEENS FROM LEFT -> RIGHT

        // // Check Vertical Column
        // for(int i = 0; i<board.length; i++){
        //     if(board[i][col]== 'Q'){
        //         return false;
        //     }
        // }

        // Check Upper left diagonal
        for(int r = row, c = col; r>=0 && c>=0; r--, c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }


        // Check Lower left diagonal
        for(int r = row, c = col; r<board.length && c>=0; r++, c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }


        // // NO NEED TO CHECK BECAUSE WE PLACING QUEENS FROM LEFT -> RIGHT

        // // Check Upper Right
        // for(int r = row, c = col; r>=0 && c<board.length; r--, c++){
        //     if(board[r][c]=='Q'){
        //         return false;
        //     }
        // }

        // // Check Lower Right
        // for(int r = row, c = col; r<board.length && c<board.length; r++, c++){
        //     if(board[r][c]=='Q'){
        //         return false;
        //     }
        // }

        return true;
    }



    public static void helper(List<List<String>> allBoards, char board[][], int col){
        if(col == board.length){
            saveboard(board, allBoards);   
            return;
        }

        for(int row = 0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(allBoards, board, col+1);
                board[row][col] = '_';          // "#_BACKTRACKING_" (IF ABOVE RECURSION WILL UNABLE TO STORE Q IN ALL COLUMN THEN INITIALLY STORED 'Q' AT [0][0] WILL BE UPDATED WITH '_', ELSE BASE CONDITION WILL REACH AND HELPER FUNCTION GET RETURNED WITHOUT COMING TO THIS STATEMENT, i.e., THIS UPDATATION  STATEMENT WILL NOT BE EXECUTED)
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value of N for the N X N chessboard: ");
        int n = sc.nextInt();

        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];

        helper(allBoards, board, 0);


        // WAYS TO ACCESS NESTED ARRAYLIST USING LOOPS.
        // WAY#1

        // int i = 0;
        // while(allBoards.size()>i){
        //     int j = 0;
        //     while (allBoards.get(i).size()>j) {
        //         System.out.println(allBoards.get(i).get(j));
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }


        // WAY#2
        int i = 1;
        for(List<String> newboard : allBoards){
            System.out.println("Solution #"+i++);
            for(String row : newboard){
                System.out.println(row);
            }
            System.out.println();
        }


        // ALL WAYS TO PLACE N QUEENS ON N x N CHESSBOARD
        System.out.println("There are " + allBoards.size() + " valid ways to place " + n + " queens on a " + n + " X " + n + " chessboard.");


        sc.close();
    }
}
