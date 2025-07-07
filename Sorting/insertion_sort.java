public class insertion_sort {
    public static void main(String[] args) {
        int arr[]={7,8,6,5,4,3,2,1};

        for(int i = 1; i<arr.length; i++){
            int current = arr[i]; //8  6
            int j = i-1;  //  -0   1

            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
}

