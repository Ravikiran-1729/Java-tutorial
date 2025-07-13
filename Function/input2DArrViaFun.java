

import java.util.Scanner;

public class input2DArrViaFun {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int col = sc.nextInt();

        int arr[][] = inputArr(sc, row, col);

        printArray(arr, row, col);

        sc.close();
    }

    public static int[][] inputArr(Scanner sc, int row, int col) {
        int arr[][] = new int[row][col];

        System.out.println("Enter Element of Array:-");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("Enter arr[" + i + "][" + j + "] element:- ");
                arr[i - 1][j - 1] = sc.nextInt();
            }
        }
        return arr;
    }



    
    public static void printArray(int arr[][], int row, int col){
        System.out.println("Your Entered Array is :-");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(arr[i-1][j-1]+"  ");
            }
            System.out.println();
        }
    }
}
