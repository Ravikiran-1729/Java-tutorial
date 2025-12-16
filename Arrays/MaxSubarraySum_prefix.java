public class MaxSubarraySum_prefix {
    
    public static int MaxSubarraySum(int arr[], int size){

        int prefixArray[] = new int[size];

        int sum = 0;
        for(int i = 0; i<size; i++){
            sum += arr[i];
            prefixArray[i] = sum;
        }

        int MaxSum = Integer.MIN_VALUE;
        for(int i = 0; i<size; i++){
            int start = i;
            for(int j = i+1; j<size; j++){
                int end = j;
                int currSum;
                if(start-1 < 0){
                    currSum = prefixArray[end];
                }else{
                    currSum = prefixArray[end] - prefixArray[start-1];
                }
                if(MaxSum < currSum){
                    MaxSum = currSum;
                }
            }
        }
        return MaxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,3,-4,5,6,7,8,-9};
        int max = MaxSubarraySum(arr, arr.length);
        System.out.println(max);
    }
}