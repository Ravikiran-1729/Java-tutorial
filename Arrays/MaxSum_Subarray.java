
public class MaxSum_Subarray {

    public static void SubArray(int arr[], int size){
        int j = 0;
        int max = Integer.MIN_VALUE;
        while (j != size) {
            for(int i = j+1; i<=size; i++){
                int sum = 0;
                for(int s = j; s<i; s++){
                    sum += arr[s];
                }
                if(sum > max){
                    sum = max;
                }
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        SubArray(arr, arr.length);
    }
}
