public class arr_declaration {
    public static void main(String[] args) {
        int arr[] = new int[10];

        //Input Array
        for(int i = 0; i<10; i++){
            arr[i] = i;
        }

        //Print Array
        System.out.print("Array is :- ");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
        }
}