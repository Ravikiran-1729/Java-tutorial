
public class MaxSum_Subarray {

    public static int SubArray(int arr[], int size){
        int j = 0;
        int max = Integer.MIN_VALUE;
        while (j != size) {
            int start = j;
            for(int i = j; i<size; i++){
                int end = i;
                int sum = 0;
                for(int s = start; s<=end; s++){
                    sum += arr[s];
                }
                if(sum > max){
                    max = sum;
                }
            }
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-4,5,6,7,8,-9};
        int max = SubArray(arr, arr.length);
        System.out.println(max);
    }
}
