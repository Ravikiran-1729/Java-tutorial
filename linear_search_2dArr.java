import java.util.*;

public class linear_search_2dArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter "+i+"th row " + "and "+j+"th column element:- ");
                arr[i][j] = sc.nextInt();
            }
        }
        print2DArray(arr, row, col);

        System.out.print("\nEnter x to search in array:- ");
        int x = sc.nextInt();

        linear_search_2dArr(arr, row, col, x);
    }

    public static void print2DArray(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void linear_search_2dArr(int arr[][], int row, int col, int x){
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]==x){
                    System.out.println(x+ " Found at location ("+i+", "+j+")");
                }
            }
        }
    }
}
