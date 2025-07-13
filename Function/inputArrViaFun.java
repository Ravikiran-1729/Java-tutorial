
import java.util.Scanner;

public class inputArrViaFun {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = inputArr(sc, size);

        printArray(arr);

        sc.close();
    }



    public static int[] inputArr(Scanner sc, int size) {
        int arr[] = new int[size];

        System.out.println("Enter Element of Array:-");
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter arr[" + i + "]" + " element:- ");
            arr[i - 1] = sc.nextInt();
        }
        return arr;
    }



    public static void printArray(int arr[]) {
        System.out.print("Your Entered Array is :-");
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i - 1] + "  ");
        }
    }
}
