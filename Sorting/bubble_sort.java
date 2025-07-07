import java.util.*;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[] = {12,11,10,9,8,7,6,5,4,3,2,1,0};

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

        System.out.println("\n"+Arrays.toString(arr));
    }
}
