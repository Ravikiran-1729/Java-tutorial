import java.util.*;

public class linear_search_2dArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        
        System.out.print("Enter number of rows: ");
        int col = sc.nextInt();

        int arr[][] = inputArr(sc, row, col);

        print2DArray(arr, row, col);

        linearSearch2DArray(sc, arr, row, col);

        sc.close();
    }



    public static int[][] inputArr(Scanner sc, int row, int col) {
        int arr[][] = new int[row][col];

        System.out.println("Enter Element of Array:-");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("Enter arr[" + i + "]["+ j + "] element:- ");
                arr[i-1][j-1] = sc.nextInt();
            }
        }
        return arr;
    }



    public static void print2DArray(int arr[][], int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(arr[i-1][j-1] + "  ");
            }
            System.out.println();
        }
    }




    public static void linearSearch2DArray(Scanner sc, int arr[][], int row, int col) {
        
        System.out.print("\nEnter x to search in array:- ");
        int x = sc.nextInt();

        System.out.println();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (arr[i-1][j-1] == x) {
                    System.out.println(x + " Found at location (" + i + ", " + j + ")");
                }
            }
        }
    }
}
