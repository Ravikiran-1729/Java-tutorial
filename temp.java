public class temp {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        print(arr, arr.length);

        bubble_sort(arr, arr.length);
        print(arr, arr.length);
    }

    public static void bubble_sort(int arr[], int n){
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void selection_sort(int arr[], int n){
         
    }
    public static void print(int arr[], int n){
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}