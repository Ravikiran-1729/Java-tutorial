public class temp {
    public static void main(String[] args) {
        int arr[] = {6, 3, 5, 9, 10, 2, 8};
        
        int n = arr.length;

        // bubble(arr, n);
        // insertion_sort(arr, n);
        // divisior(arr, 0, n-1);
        quick(arr, 0, n-1);
        printArray(arr, n);


    }
    public static void bubble(int arr[], int n){
        for(int i =0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }



    public static void insertion_sort(int arr[], int n){
        
        // int arr[] = {5,4,3,2,1};  4 5 3 2 1   4 5 5 2 1    4 4 5 2 1    3 4 5 2 1
        
        for(int i = 1; i<n; i++){
            int current = arr[i];
            int sortedidx = i-1;

            while(sortedidx>=0 && current<arr[sortedidx]){
                arr[sortedidx+1] = arr[sortedidx];
                sortedidx--;
            }

            arr[sortedidx+1] = current;
        }

    }


    public static void divisior(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si) / 2;

        divisior(arr, si, mid);
        divisior(arr, mid+1, ei);
        conquer(arr, si, mid, ei);



    }
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while (idx1<=mid && idx2<=ei) {
            if(arr[idx1]>arr[idx2]){
                merged[x++] = arr[idx2++];
            }else{
                merged[x++] = arr[idx1++];
            }
        }
        while (idx1<=mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2<=ei) {
            merged[x++] = arr[idx2++];
        }

        for(int i = 0, j = si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    public static void quick(int arr[], int low, int high){
        if(low<high){
            int pidx = partition(arr, low, high);

            quick(arr, low, pidx-1);
            quick(arr, pidx+1, high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            if(pivot>arr[j]){
                i++;
                // swap
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



    public static void printArray(int arr[], int n){
        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
























// 6 3 9 5 2 8
// pivot = 8   i = -1
// i = 0
// 6 
// 6 3 5 9 2 8
// 6 3 5 2 9 8
