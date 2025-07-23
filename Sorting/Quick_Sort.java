public class Quick_Sort {
    public static void main(String[] args) {
        int arr[] = {8,7,6,5,4,3,2,1};
        
        divisior(arr, 0, arr.length-1);
        printArray(arr);
    }
    
    public static void divisior(int arr[], int low, int high){
        if(low<high){
            int pidx = partition(arr, low, high);

            divisior(arr, low, pidx-1);
            divisior(arr, pidx+1, high);
        }
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j<high; j++){
            if (arr[j]<pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
