public class Subarray {

    public static void SubArray(int arr[], int size){
        int j = 0;
        while (j != size) {
            for(int i = j+1; i<=size; i++){
                System.out.print("(");
                for(int s = j; s<i; s++){
                    if(s!=i-1){
                        System.out.print(arr[s]+", ");
                    }else{
                        System.out.print(arr[s]);
                    }
                }
                System.out.print("), ");
            }
            System.out.println();
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        SubArray(arr, arr.length);
    }
}
