public class Pairs_inArray {
    public static void printPairs(int arr[], int size){

        int j = 0;
        while (j != size-1) {
            for(int i = j+1; i<size; i++){
                System.out.print("("+arr[j]+ ", "+arr[i]+")  ");
            }
            System.out.println();
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,4,5,9,2,3,1};
        int size = arr.length;
        printPairs(arr, size);
    }
}
