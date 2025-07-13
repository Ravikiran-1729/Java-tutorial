public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {8,7,6,5,4,3,2,1,0,9,3};

        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length-1; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
