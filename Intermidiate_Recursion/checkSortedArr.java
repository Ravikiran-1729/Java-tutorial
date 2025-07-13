import java.util.Scanner;

public class checkSortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array:- ");
        int size = sc.nextInt();
        int arr[] = inputArray(sc, size);

        printArray(arr);

        if(isSorted(arr, 0)){
            System.out.println("This Array is Sorted");
        }else{
            System.out.println("This Array is Not Sorted");
        }
    }



    public static int[] inputArray(Scanner sc, int size){
        int arr[] = new int[size];

        System.out.println("Enter a elements of Array:-");
        for(int i = 0; i<size; i++){
            System.out.print("Enter arr["+i+"] element:- ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }



    public static boolean isSorted(int arr[], int idx){
        if(arr.length-1 == idx+1){
            return true;
        }

        if(arr[idx]>arr[idx+1]){
            return false;
        }

        return isSorted(arr, idx+1);
    }




    public static void printArray(int arr[]){
        System.out.print("Array:- ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
