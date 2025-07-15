import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NQueens {

    public static void saveboard(char board[][], List<List<String>> allBoards){
        String row = "";
        List<String> newlist = new ArrayList<>();

        for(int i = 0; i<board.length; i++){
            row = "";
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j]== 'Q'){
                    row += "Q  ";
                }else{
                    row += "_  ";
                }
            }
            newlist.add(row);
        }
        allBoards.add(newlist);

        
    }

    public static boolean isSafe(int row, int col, char[][] board){
        for(int j = 0; j<board.length; j++){
            if(board[row][j]== 'Q'){
                return false;
            }
        }

        for(int i = 0; i<board.length; i++){
            if(board[i][col]== 'Q'){
                return false;
            }
        }

        for(int r = row, c = col; r>=0 && c>=0; r--, c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        
        for(int r = row, c = col; r<board.length && c>=0; r++, c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        for(int r = row, c = col; r>=0 && c<board.length; r--, c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        for(int r = row, c = col; r<board.length && c<board.length; r++, c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void helper(List<List<String>> allBoards, char board[][], int col){
        if(col == board.length){
            // for(int i = 0; i<board.length; i++){
            //     for(int j = 0; j<board.length; j++){
            //         System.out.print(board[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            
            // System.out.println();
            // System.out.println();
            saveboard(board, allBoards);
            return;
        }
        for(int row = 0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(allBoards, board, col+1);
                board[row][col] = '.';
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

        int i = 0;
        while(allBoards.size()>i){
            int j = 0;
            while (allBoards.get(i).size()>j) {
                System.out.println(allBoards.get(i).get(j));
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("There are " + allBoards.size() + " valid ways to place " + n + " queens on a " + n + " X " + n + " chessboard.");

        sc.close();
    }
}
