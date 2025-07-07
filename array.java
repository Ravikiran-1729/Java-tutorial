public class array {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for(int i = 10, j = 0; i<=100 | j<arr.length; i = i +10, j++){
            arr[j] = i;
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
        }
}