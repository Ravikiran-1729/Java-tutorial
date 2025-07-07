import java.util.*;
public class selection {
    public static void main(String[] args) {
        int arr[] = {8,0,6,5,4,3,2,1};

        for(int i = 0; i< arr.length-1; i++){
            int smallest = i;
            for(int j = smallest+1; j<arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    // Method to print the elements of the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
