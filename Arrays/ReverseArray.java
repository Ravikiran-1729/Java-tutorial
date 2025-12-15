public class ReverseArray {
    public static void reverse(int arr[], int size){
        int l = 0;
        int r = size-1;
        int mid = l + (r-l)/2;
        while (l != mid || r != mid) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {85,88,27,58,12,66,41};
        int size = arr.length;

        reverse(arr, size);
        
        for(int i = 0; i<size; i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println();
    }
}
